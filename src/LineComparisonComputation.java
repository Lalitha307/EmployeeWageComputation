public class LineComparisonComputation {
    public static double calculateLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    public static int compareLines(double length1, double length2) {
        return Double.compare(length1, length2);  // Returns 0, 1, or -1
    }
    public static double calculateMonthlyWage(double wagePerHour, int hoursPerDay, int workingDays) {
        return wagePerHour * hoursPerDay * workingDays;
    }
    public static void main(String[] args) {
        double wagePerHour = 20;
        int hoursPerDay = 8;
        int workingDays = 20;
        double monthlyWage = calculateMonthlyWage(wagePerHour, hoursPerDay, workingDays);
        System.out.println("Total Monthly Wage: " + monthlyWage);
    }
}
