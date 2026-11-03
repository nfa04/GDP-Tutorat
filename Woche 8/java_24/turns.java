class Turns {

    // Diese Methode müssen Sie nicht verändern
    public static boolean rightTurn(double x1, double y1, double x2, double y2, double x3, double y3) {
        if (((y2 - y1) * (x3 - x2)) - ((x2 - x1) * (y3 - y2)) > 0) {
            return true;
        }
        return false;
    }

    // Ihre Lösung

    public static void main(String[] args) {
        double[] p1 = new double[]{0.0, 0.0};
        double[] p2 = new double[]{-0.84, 1.88};
        double[] p3 = new double[]{1.54, 2.7};
        double[] p4 = new double[]{2.18, 1.12};
        double[] p5 = new double[]{-1.44, 0.7};
        double[] p6 = new double[]{0.6, 2.0};
        double[] p7 = new double[]{0.8, -0.88};

        // Ihre Lösung
    }
}