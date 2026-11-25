package informationhiding.p1;

public class ProtectedBook {

    String title;

    public ProtectedBook(String title) {
        this.title = title;
        if (title != null) {
            System.out.println("Created the following Book: " + title);
        }
    }

    private static ProtectedBook createEmptyBook() {
        return new ProtectedBook(null);
    }

    public static ProtectedBook getBook(String title, String password) {
        if (password == "reader") {
            return new ProtectedBook(title);
        }
        else {
            System.out.println("Wrong password! Returned empty book.");
            return createEmptyBook();
        }
    }

}
