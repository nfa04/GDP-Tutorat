package printer;

public class StarPrinter implements Printer {
    @Override
    public void print(String s) {
        System.out.println("*" + s + "*");
    }
}
