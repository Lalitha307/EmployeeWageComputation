import java.util.ArrayList;
import java.util.List;

public class LineComparisonComputation {
    public static double calculateLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    public static int compareLines(double length1, double length2) {
        return Double.compare(length1, length2);  // Returns 0, 1, or -1
    }
    public static double findLongestLine(List<Double> lengths) {
        double longest = lengths.get(0);
        for (double length : lengths) {
            if (length > longest) {
                longest = length;
            }
        }
        return longest;
    }
    public static double findShortestLine(List<Double> lengths) {
        double shortest = lengths.get(0);
        for (double length : lengths) {
            if (length < shortest) {
                shortest = length;
            }
        }
        return shortest;
    }
    public static double calculateAverageLength(List<Double> lengths) {
        double sum = 0;
        for (double length : lengths) {
            sum += length;
        }
        return sum / lengths.size();
    }
    public static void main(String[] args) {
        // List to store the lengths of the lines
        List<Double> lineLengths = new ArrayList<>();
        int[][] coordinates = {
                {1, 1, 4, 5},   // Line 1
                {2, 2, 5, 6},   // Line 2
                {3, 3, 6, 7},   // Line 3
                {4, 4, 7, 8}    // Line 4
        };
        for (int[] coord : coordinates) {
            double length = calculateLength(coord[0], coord[1], coord[2], coord[3]);
            lineLengths.add(length);
        }
        System.out.println("Lengths of all lines:");
        for (double length : lineLengths) {
            System.out.println(length);
        }
        double longest = findLongestLine(lineLengths);
        double shortest = findShortestLine(lineLengths);
        double average = calculateAverageLength(lineLengths);
        System.out.println("Longest Line Length: " + longest);
        System.out.println("Shortest Line Length: " + shortest);
        System.out.println("Average Line Length: " + average);
    }
}
