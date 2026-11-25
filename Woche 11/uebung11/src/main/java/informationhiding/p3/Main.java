package informationhiding.p3;

public class Main {

    public static int totalAmount(Inventory inventory) {
        int[] stock = inventory.getStock();
        int n = inventory.stockSize();
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += stock[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.display();
        System.out.println("Total:");
        System.out.println(totalAmount(inventory));
    }
}
