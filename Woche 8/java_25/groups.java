class Groups {

    public static void assignments(int students, int maxSize) {
        // Aufrunden von students / maxSize mit reiner Ganzzahlarithmetik
        int groups = (students + maxSize - 1) / maxSize;
        System.out.println("Es braucht mindestens " + groups + " Übungsgruppen");

        // Alternative mit Fallunterscheidung:
        // int groups = students / maxSize;
        // if (students % maxSize != 0) { groups = groups + 1; }
    }

    public static void main(String[] args) {
        // Berechnung für 135 Studierende mit Gruppengrösse 7
        assignments(134, 7);
    }
}