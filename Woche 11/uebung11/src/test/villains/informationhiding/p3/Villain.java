package informationhiding.p3;

public class Villain {

    public static void sabotage(Inventory inventory) {
        int[] stock = inventory.getStock();

        stock[0] = 0;
        stock[1] = 0;
        stock[2] = 0;

        System.out.println("Muahahaha!");
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.display();
        sabotage(inventory);
        inventory.display();
    }
}
