// Programm 1: Gültigkeitsbereich (Scope)
public class ScopeError {
    public static void main(String[] args) {
        int wert = 10;
        if (wert > 5) {
            int ergebnis = wert * 2;
        }
        System.out.println(ergebnis); 
    }
}