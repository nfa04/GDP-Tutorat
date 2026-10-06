class Riddle {
    public static void main(String[] args){
        String str = "hallo";
        int i = Riddle.irgendwas(str);
        if(Riddle.nochmalwas(i) == "gut") {
            System.out.println("hallo");
        } else if(Riddle.wasanderes(str)) {
            System.out.println("du!");
        }
    }

    public static int irgendwas(String input) {
        return input.length();
    }

    public static String nochmalwas(int input) {
        if(input > 2) {
            return "gut";
        }
        return "schlecht";
    }

    public static boolean wasanderes(String input) {
        System.out.println(input);
        return false;
    }
}