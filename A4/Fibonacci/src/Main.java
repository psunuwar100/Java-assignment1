import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner inputObj = new Scanner(System.in);
        int x;
        System.out.println("Enter the n:");
        x = inputObj.nextInt();

        System.out.println("The " + x + " terms of fibanocci numbers are-");
        int a, b, c, n;
        a = b = 1;
        for (n = 1; n <= x; n++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
    }
}