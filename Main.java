
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("How many colours has a rainbow? Please choose one of the variants below");
            String ChoiceOne = "5";
            String ChoiceTwo = "6";
            String ChoiceThree = "7";
            String CorrectAnswer = ChoiceThree;
            System.out.println(ChoiceOne);
            System.out.println(ChoiceTwo);
            System.out.println(ChoiceThree);
            String UserInput = input.next();
        System.out.println(UserInput);
            if (CorrectAnswer.matches(UserInput))
            {
                System.out.println("Congratulations! You are right!");
            }
            else
            {
                System.out.println("Please choose another answer");

        }
        }

    }
