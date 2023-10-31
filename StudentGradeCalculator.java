import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of subjects: ");
        int numSubject = sc.nextInt();

        double totalMark = 0;

        for (int i = 1; i <= numSubject; i++) {
            System.out.println("Enter marks obtained in subject " + i);
            double marks = sc.nextDouble();
            totalMark += marks;
        }
        double averagePercentage = (double) (totalMark / numSubject );
        System.out.println("Total Marks:" + totalMark);
        System.out.println("Average Percentage:" + averagePercentage + "%");

        char grade;

        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 80) {
            grade = 'B';
        } else if (averagePercentage >= 70) {
            grade = 'C';
        } else if (averagePercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade:" + grade);

    }

}
