import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputObj=new Scanner(System.in);
        System.out.println("The Choosing Game");

            int count = 0;
            System.out.println("Please Guess The Number");
            int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
            Random number = new Random();
            int cvalue = number.nextInt(10);
            int cmove = array[cvalue];

            for (int a = 0; a <= 4; a++) {
                System.out.println("Enter your guess");
                int guess=inputObj.nextInt();
                if (guess==cmove){
                    System.out.println("Your guess is correct");
                } else if (guess<=cmove) {
                    System.out.println("Try again");
                }else if (guess>=cmove){
                    System.out.println("Try again");
                }
                count=count+1;
            }
            if (count==5){
                System.out.println("Better luck next time");
            }
            
    }
}