package informationhiding.p4;

public class Main {

    public static void countEven(int[] arr, Counter counter) {
        for (int i : arr) {
            if (i % 2 == 0) {
                counter.count++;
            }
        }
    }

    public static void main(String[] args) {
        Counter evenCounter = new Counter();
        int[] arr = new int[]{1,2,5,8,3,6};
        countEven(arr, evenCounter);
        evenCounter.display();

    }
}
