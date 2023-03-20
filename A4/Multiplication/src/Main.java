import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = inputObj.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}