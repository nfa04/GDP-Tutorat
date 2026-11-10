class SalaryCalculator {
    public static void main(String[] args) {
        double dailySalary = 250;
        double workingHoursPerDay = 8;
        double hourlyRate = dailySalary / workingHoursPerDay;
        System.out.println("Der Stundenlohn beträgt: " + hourlyRate + " Franken.");
    }
}