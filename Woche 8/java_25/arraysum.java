import java.util.Arrays;

class ArraySum {

    public static double[] add(double[] arr, double x) {
        double[] added = new double[arr.length];
        for(int i = 0; i < arr.length; i++) {
            added[i] = arr[i] + x;
        }
        return added;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(add(new double[]{1.2, 2.5, 1.0}, 2.0)));
    }
}