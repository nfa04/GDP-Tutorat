class SalaryCalculator {
    public static void main(String[] args) {
        int dailySalary = 250;
        int workingHoursPerDay = 8;
        double hourlyRate = dailySalary / workingHoursPerDay;
        System.out.println("Der Stundenlohn beträgt: " + hourlyRate + " Franken.");
    }
}