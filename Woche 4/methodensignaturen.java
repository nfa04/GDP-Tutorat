public static void begruessePerson(String vorname, String nachname) {
    System.out.println("Hallo! " + vorname + " " + nachname);
}

public static boolean istSchaltjahr(int jahr) {
    return true;
}

public static double berechneRechteckFlaeche(double laenge, double breite) {
    return laenge * breite;
}

public static String verknuepfeWorte(String worteins, String wortzwei, String wortdrei) {
    return worteins + wortzwei + wortdrei;
}

public static void zeigeFehlerAn(int fehlercode) {
    System.out.println("Fehler nummer " + fehlercode + " ist aufgetreten.");
}

zeigeFehlerAn(10);
String worte = verknuepfeWorte();
if(worte == "hallo du") {

}