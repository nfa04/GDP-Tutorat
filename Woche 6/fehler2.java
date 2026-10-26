class Aufgabe2 {

    // Die Methode soll alle geraden Zahlen zwischen 1 und n ausgeben

    public static void even(int n) {
        for (int i = 2; i <= n; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        even(8);
    }
}