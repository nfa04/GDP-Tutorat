package informationhiding.p4;

public class Villain {

    public static void stealCount(Counter counter) {
        counter.count = 0;
        System.out.println("Muahahaha!");
    }

    public static void main(String[] args) {
        Counter evenCounter = new Counter();
        int[] arr = new int[]{1,2,5,8,3,6};
        Main.countEven(arr, evenCounter);
        evenCounter.display();
        stealCount(evenCounter);
        evenCounter.display();

    }

}
