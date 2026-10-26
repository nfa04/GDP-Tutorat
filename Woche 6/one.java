public class MultiPrinter {
    
    public static void main(String[] args) {
        MultiPrinter.printNTimes(30);
    }
    public void printNTimes(String text, int n) {
        for(int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

}