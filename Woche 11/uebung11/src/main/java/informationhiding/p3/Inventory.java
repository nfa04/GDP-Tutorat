package informationhiding.p3;

public class Inventory {
    private int[] stock;

    public Inventory() {
        stock = new int[]{10, 20, 30};
    }

    public int[] getStock() {
        return stock;
    }

    public int stockSize() {
        return stock.length;
    }

    public void display() {
        for (int amount : stock) {
            System.out.println(amount);
        }
    }
}
