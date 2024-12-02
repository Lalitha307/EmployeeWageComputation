public class EmployeeWageComputation {
    public static void main(String[] args) {
        final int FULL_TIME = 1;
        final int PART_TIME = 2;
        final int WAGE_PER_HOUR = 20;
        int workHours = 0;
        int attendance = (int) (Math.random() * 3);
        switch (attendance) {
            case FULL_TIME:
                workHours = 8;
                break;
            case PART_TIME:
                workHours = 4;
                break;
            default:
                workHours = 0;
        }
        int dailyWage = workHours * WAGE_PER_HOUR;
        System.out.println("Employee Wage: " + dailyWage);
    }
}
