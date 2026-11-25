package informationhiding.p1;

public class Main {

    public static void main(String[] args) {
        ProtectedBook.getBook("Lord of the Rings", "readr");
        System.out.println("Oops, mistyped");
        ProtectedBook.getBook("Lord of the Rings", "reader");
    }
}
