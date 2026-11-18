class Laptop {
    String color;

    public void zuklappen() {

    }

    public static String[] getBrands() {
        return new String[] {"HP", "Apple"};
    }

}

class App {
    public static void main() {
        Laptop.getBrands();
        Laptop meinLaptop = new Laptop();
        meinLaptop.zuklappen();
    }
}