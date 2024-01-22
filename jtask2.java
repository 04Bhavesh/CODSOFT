import java.util.*;

public class jtask2 {
    Scanner sc = new Scanner(System.in);
    int phy, che, mat, bio, tsub;
    int tmarks = 0;
    String grade;

    public void input() {
        System.out.print("\nEnter the total no. of subjects: ");
        tsub = sc.nextInt();
        int i;
        for (i = 1; i <= tsub; i++) {
            System.out.print("\nEnter the marks of Subject" + i + " out of 100: ");
            int subi = sc.nextInt();
            // System.out.println("Enter the marks of Chemistry out of 100: ");
            // che = sc.nextInt();
            // System.out.println("Enter the marks of Maths out of 100: ");
            // mat = sc.nextInt();
            // System.out.println("Enter the marks of Biology out of 100: ");
            // bio = sc.nextInt();
            tmarks += subi;
        }
        int avgPerc = tmarks / tsub;

        if (avgPerc >= 90) {
            grade = "A+";
        } else if (avgPerc >= 80 && avgPerc < 90) {
            grade = "A";
        }

        else if (avgPerc >= 70 && avgPerc < 80) {
            grade = "B+";
        }

        else if (avgPerc >= 60 && avgPerc < 70) {
            grade = "B";
        }

        else if (avgPerc >= 50 && avgPerc < 60) {
            grade = "C+";
        }

        else if (avgPerc >= 40 && avgPerc < 50) {
            grade = "C";
        } else {
            grade = "Fail!!!";
        }
        System.out.println("\n\nYour Total marks is " + tmarks + "\nYour average percentage is " + avgPerc + "%"
                + "\nYour Grade is " + grade);

    }

    public static void main(String[] args) {
        jtask2 obj = new jtask2();
        obj.input();
    }
}
