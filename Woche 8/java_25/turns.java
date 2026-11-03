class Turns{

    // Diese Methode sollen Sie nicht verändern
    public static boolean cross(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        if (Math.signum(((y2 - y1) * (x3 - x2)) - ((x2 - x1) * (y3 - y2))) != Math.signum(((y2 - y1) * (x4 - x2)) - ((x2 - x1) * (y4 - y2))) &&
            Math.signum(((y4 - y3) * (x2 - x4)) - ((x4 - x3) * (y2 - y4))) != Math.signum(((y4 - y3) * (x1 - x4)) - ((x4 - x3) * (y1 - y4)))) {
            return true;
        }
        return false;
    }

    // Ihre Lösung

    public static void main(String[] args) {
        double[] p1 = new double[]{-1.72, -0.18};
        double[] p2 = new double[]{1.84, 3.68};
        double[] p3 = new double[]{-2.38, 3.98};
        double[] p4 = new double[]{1.66, -0.48};
        double[] p5 = new double[]{0.08, 5.38};
        double[] p6 = new double[]{-0.32, 0.36};
        double[] p7 = new double[]{3.44, 2.74};

        // Ihre Lösung
    }
}