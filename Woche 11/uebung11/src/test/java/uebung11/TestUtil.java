package uebung11;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.*;
import java.nio.file.*;
import java.util.*;
import javax.tools.*;

final class TestUtil {
    private TestUtil() {}

    static String visibility(int m) {
        if (Modifier.isPublic(m)) return "public";
        if (Modifier.isProtected(m)) return "protected";
        if (Modifier.isPrivate(m)) return "private";
        return "package-private";
    }

    static Class<?> cls(String name) {
        try {
            return Class.forName(name);
        } catch (ClassNotFoundException e) {
            throw new AssertionError("Klasse " + name + " nicht gefunden", e);
        }
    }

    static void assertClass(String name, String expected) {
        assertEquals("Sichtbarkeit der Klasse " + name, expected, visibility(cls(name).getModifiers()));
    }

    static void assertField(String cls, String field, String expected) {
        try {
            Field f = cls(cls).getDeclaredField(field);
            assertEquals("Sichtbarkeit von Feld " + cls + "." + field, expected, visibility(f.getModifiers()));
        } catch (NoSuchFieldException e) {
            throw new AssertionError("Feld " + cls + "." + field + " nicht gefunden", e);
        }
    }

    static void assertMethod(String cls, String method, String expected, Class<?>... params) {
        try {
            Method m = cls(cls).getDeclaredMethod(method, params);
            assertEquals("Sichtbarkeit von Methode " + cls + "." + method + "()", expected, visibility(m.getModifiers()));
        } catch (NoSuchMethodException e) {
            throw new AssertionError("Methode " + cls + "." + method + " nicht gefunden", e);
        }
    }

    static void assertConstructor(String cls, String expected, Class<?>... params) {
        try {
            Constructor<?> c = cls(cls).getDeclaredConstructor(params);
            assertEquals("Sichtbarkeit des Konstruktors von " + cls, expected, visibility(c.getModifiers()));
        } catch (NoSuchMethodException e) {
            throw new AssertionError("Konstruktor von " + cls + " nicht gefunden", e);
        }
    }

    /** Fuehrt Klasse.main(new String[0]) aus und liefert die Ausgabe (Zeilenenden normalisiert). */
    static String runMain(String cls) {
        PrintStream old = System.out;
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        try {
            System.setOut(new PrintStream(buf, true, "UTF-8"));
            Method m = cls(cls).getDeclaredMethod("main", String[].class);
            m.setAccessible(true);
            m.invoke(null, (Object) new String[0]);
            return buf.toString("UTF-8").replace("\r\n", "\n").trim();
        } catch (Exception e) {
            throw new AssertionError("main von " + cls + " konnte nicht ausgefuehrt werden: " + e, e);
        } finally {
            System.setOut(old);
        }
    }

    /** Versucht die (unveraenderte) boese Klasse gegen die Loesung zu kompilieren. */
    static boolean compiles(String villainFile) {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        Path src = Paths.get("src", "test", "villains").resolve(villainFile);
        assertTrue("Datei fehlt: " + src, Files.exists(src));
        try {
            Path out = Files.createTempDirectory("villain");
            int rc = compiler.run(null, null, null,
                    "-proc:none", "-classpath", System.getProperty("java.class.path"),
                    "-d", out.toString(), src.toString());
            return rc == 0;
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }
}
