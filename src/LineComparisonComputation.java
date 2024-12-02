public class LineComparisonComputation {
    public static double calculateLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    public static boolean areLinesEqual(double length1, double length2) {
        return length1 == length2;
    }
    public static void main(String[] args) {
        int x1 = 1, y1 = 1, x2 = 4, y2 = 5;
        int x3 = 2, y3 = 2, x4 = 5, y4 = 6;
        double length1 = calculateLength(x1, y1, x2, y2);
        double length2 = calculateLength(x3, y3, x4, y4);
        System.out.println("Length of Line 1: " + length1);
        System.out.println("Length of Line 2: " + length2);
        if (areLinesEqual(length1, length2)) {
            System.out.println("The two lines are equal.");
        } else {
            System.out.println("The two lines are not equal.");
        }
    }
}
