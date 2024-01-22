import java.util.*;
import java.lang.Math;

public class jtask1 {
    int count = 1;
    int count2 = 0;

    public void game() {
        Scanner sc = new Scanner(System.in);
        int max = 100;
        int min = 0;
        int guess, ran;

        ran = (int) (Math.random() * (max - min + 1) + min);

        for (int i = 0; i < 5; i++) {

            System.out.print("\nEnter your guess between(0 to 100) :- ");
            guess = sc.nextInt();

            if (guess == ran) {
                count2 += 1;
                System.out.println("!!! Correct !!!");

            } else if (guess < ran) {
                count += 1;
                System.out.println("!!! Too low !!!");
            } else {
                count += 1;
                System.out.println("!!! Too High !!!");
            }
        }
        System.out.println("\n!----- Game is over -----!");
        System.out.println("\nRandom No. was " + ran + "......");
        System.out.println("\n\nYour Score is:- \nTotal no. of attempts takes are " + count
                + " and  Total no. of correct guesses are " + count2 + ".....");
        System.out.println("\n!!! You finishes your all attempts !!!");
    }

    public static void main(String[] args) {

        jtask1 obj = new jtask1();
        int choice;
        Scanner sc1 = new Scanner(System.in);
        obj.game();
        do {

            System.out.println("\nDo you want to play again:- ");
            System.out.println("\n1.YES\n2.NO");
            System.out.print("\nEnter your choice (1 or 2):- ");
            choice = sc1.nextInt();

            switch (choice) {
                case 1:
                    obj.game();
                    break;
                case 2:
                    System.out.println("Your Score is:- \nTotal no. of attempts takes are " + obj.count
                            + " and  Total no. of correct guesses are " + obj.count2);
                    System.out.println("\n!!! You finishes your all attempts !!!");
                    break;
                default:
                    System.out.println("\n!!! Invalid Choice !!!");
                    break;

            }

        } while (choice < 2);
    }
}
