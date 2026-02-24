
import java.util.Scanner;
import java.util.Random;


public class lab06A{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print(" Enter your upper range as a number");

        int x = scanner.nextInt();

        System.out.print("Enter your lower range as a number");

        int y = scanner.nextInt();

        int randomNumber = random.nextInt((x-y)+1) + y;

        boolean guessIsWrong = true;
        while (guessIsWrong){


            System.out.print("Enter your guess for the number");

            int guess = scanner.nextInt();

            if (guess != randomNumber){
                if (randomNumber > guess){
                    System.out.print("The target number is larger");
                }
                else if(randomNumber < guess){
                    System.out.print("The target number is smaller");

                }
            }
            else{
                System.out.print("You got it");
            }



        }










    }
}