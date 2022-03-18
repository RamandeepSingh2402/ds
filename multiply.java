import java.util.Scanner;

public class multiply {
    //main method
    public static void main(String[] args) {

        //importing scanner class
        Scanner in = new Scanner(System.in);

        //printing the message to the console for the user to input the first integer
        System.out.print("Kindly enter the first integer value: ");

        //taking in the first integer variable
        int a = in.nextInt();

        //for good format
        System.out.println(" ");

        //printing the message to the console for the user to input the second integer
        System.out.print("Kindly enter the second integer value: ");

        //taking in the second integer variable
        int b = in.nextInt();

        //for good format
        System.out.println(" ");

        //multiplying the integers and storing the value in a variable multiply
        int multiply = a*b;

        //printing the product of the two inputs
        System.out.println("The product of the two number is: " + multiply);


    }
}

