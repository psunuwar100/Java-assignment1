
import java.util.Scanner;
public class Triangle {
    Scanner inputObj=new Scanner(System.in);


    public void displayTriangle(){
        System.out.println("Enter a:");
        int a=inputObj.nextInt();
        System.out.println("Enter b:");
        int b=inputObj.nextInt();
        System.out.println("Enter c:");
        int c=inputObj.nextInt();
        System.out.println("Perimeter= "+(a+b+c));
    }


}

