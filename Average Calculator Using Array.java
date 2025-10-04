import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        double[] marks = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter mark for student " + (i + 1) + ": ");
            marks[i] = sc.nextDouble();
            sum += marks[i];
        }

        double average = sum / n;
        System.out.println("Average Marks = " + average);

        sc.close();
    }
}
