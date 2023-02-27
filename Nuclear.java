import java.util.Scanner;

public class Nuclear{
    public static void main(String[] args){
        Scanner inputObj = new Scanner(System.in);
        System.out.println("What is the total number of employees?");
        int number1=inputObj.nextInt();
        System.out.println("What is the name of the supervisor?");
        String name=inputObj.next();
        System.out.println("How many times the Nuclear waste is removed from the core?");
        int number2=inputObj.nextInt();
        System.out.println("What is the total weight of the waste produced every 1 week?");
        float number3=inputObj.nextFloat();
        System.out.println("Is Electric Motor being replaced every 18 days? Press y for Yes and n for No.");
        char yn=inputObj.next().charAt(0);
        System.out.println("What is the core average temperature ( celsius ) of the Nuclear Reactor?");
        float number4=inputObj.nextFloat();

        System.out.println("The total number of employees is "+number1);
        System.out.println("The name of the supervisor is "+name);
        System.out.println("The number of times Nuclear waste is removed is "+number2);
        System.out.println("The total weight of waste is "+number3);
        if(yn=='y'){
            System.out.println("Yes, it is");
        }
        else{
            System.out.println("No, it is not");
        }
        System.out.println("The average temperature of nuclear reactor is " +(number4+273.15));
    }
}
