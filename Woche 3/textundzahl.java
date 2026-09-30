class TextUndZahl {
    public static void main(String[] args) {
        String textZahl = "42";
        int zahl = Integer.parseInt(textZahl);
        String neuerText = String.valueOf(zahl + 8);

        String woche = "Woche02";
        String wort = woche.substring(0, 5); // Zeichen 0 bis 4: "Woche"
        String nummer = woche.substring(5);  // ab Zeichen 5: "02"

        System.out.println("42 + 8 als Zahl: " + (zahl + 8));
        System.out.println("Zurück als Text: " + neuerText);
        System.out.println(wort + " / " + nummer);
    }
}