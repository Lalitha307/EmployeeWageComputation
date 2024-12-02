public class EmployeeWageComputation {
    public static void main(String[] args) {
        final int WAGE_PER_HOUR = 20;
        final int MAX_HOURS = 100;
        final int MAX_DAYS = 20;
        final int FULL_DAY_HOUR = 8;
        final int PART_TIME_HOUR = 4;
        int totalHours = 0, totalDays = 0, totalWage = 0;
        while (totalHours < MAX_HOURS && totalDays < MAX_DAYS) {
            int attendance = (int) (Math.random() * 3);
            int workHours = attendance == 1 ? FULL_DAY_HOUR : attendance == 2 ? PART_TIME_HOUR : 0;
            totalHours += workHours;
            totalDays++;
            totalWage += workHours * WAGE_PER_HOUR;
        }
        System.out.println("Total Wage: " + totalWage);
    }
}
