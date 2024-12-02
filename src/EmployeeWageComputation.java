public class EmployeeWageComputation {
    public static void main(String[] args) {
        final int WORKING_DAYS = 20;
        final int WAGE_PER_HOUR = 20;
        final int FULL_DAY_HOUR = 8;

        int monthlyWage = WORKING_DAYS * FULL_DAY_HOUR * WAGE_PER_HOUR;
        System.out.println("Monthly Wage: " + monthlyWage);
    }
}
