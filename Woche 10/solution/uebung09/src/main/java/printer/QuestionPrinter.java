package printer;

public class QuestionPrinter implements Printer {
    @Override
    public void print(String s) {
        System.out.println(s + "?");
    }
}
