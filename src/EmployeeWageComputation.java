public class EmployeeWageComputation {
    public static void main(String[] args) {
        int IS_PRESENT = 1;
        int attendance = (int) (Math.random() * 2);
        if (attendance == IS_PRESENT) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}