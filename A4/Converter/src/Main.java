import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner inputObj=new Scanner(System.in);
         float nrs;
        System.out.println("Enter your amount:");
        nrs=inputObj.nextFloat();

        System.out.println("Rs."+ nrs +" is equal to "+"$"+(nrs/135.03));
    }
}