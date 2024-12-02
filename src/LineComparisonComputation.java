public class LineComparisonComputation {
    public static int compareLines(double length1, double length2) {
        return Double.compare(length1, length2);  // Returns 0, 1, or -1
    }
    public static double calculateWagesUntilCondition(double wagePerHour, int hoursPerDay, int maxHours, int maxDays) {
        int totalHours = 0;
        int totalDays = 0;
        double totalWage = 0;
        while (totalHours < maxHours && totalDays < maxDays) {
            totalHours += hoursPerDay;
            totalDays++;
            totalWage += wagePerHour * hoursPerDay;
        }
        return totalWage;
    }
    public static void main(String[] args) {
        double wagePerHour = 20;
        int hoursPerDay = 8;
        int maxHours = 100;
        int maxDays = 20;
        double totalWage = calculateWagesUntilCondition(wagePerHour, hoursPerDay, maxHours, maxDays);
        System.out.println("Total Wage: " + totalWage);
    }
}
