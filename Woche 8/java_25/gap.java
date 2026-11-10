class Gap {

    public static String makeGap(String str1, String str2, int n) {
        System.out.println(("%s%" + (str2.length() + n)) + "s");
        return String.format(("%s%" + (str2.length() + n)) + "s", str1, str2);
    }

    public static void main(String[] args) {
        System.out.println(makeGap("Java", "Fun", 1));
        System.out.println(makeGap("Java", "Fun", 2));
    }
}