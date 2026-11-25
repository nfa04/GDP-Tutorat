package informationhiding.p1;

public class EagerReader {

    public static void main(String[] args) {
        ProtectedBook.getBook("Lord of the Rings", "?");
        System.out.println("I don't know the password");
        new ProtectedBook("Illegal Lord of the Rings");
    }
}
