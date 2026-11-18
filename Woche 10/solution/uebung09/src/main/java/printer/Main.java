package printer;

public class Main {

    public static void printingChoice(String text, Printer printer) {
        printer.print(text);
    }

    public static void main(String[] args) {
        Printer star = new StarPrinter();
        Printer question = new QuestionPrinter();

        printingChoice("Hallo", star);   // *Hallo*
        printingChoice("Java", question); // Java?
    }
}
