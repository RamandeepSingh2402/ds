import java.util.Scanner;

public class sum {

    /**
     * this is the main method, which takes in two inputs, calculates the sum of two numbers, and prints the same
     */
    public static void main(String[] args) {

        //defining the scanner class
        Scanner in = new Scanner(System.in);

        //printing the message for the user to enter the first number
        System.out.print("Enter the first number: ");

        //taking in the input of the first number and storing it in the variable a
        int a = in.nextInt();

        //printing an empty space to align the output
        System.out.println(" ");

        //printing the message for the user to enter the second number
        System.out.print("Enter the second number: ");

        //taking in the input, and storing the second number in the variable b
        int b = in.nextInt();

        //calculating the sum of the two numbers and storing it in the variable sum
        int sum = a + b;

        //printing the sum of the two numbers
        System.out.println("The sum of the two numbers is: " + sum);

    }
}
