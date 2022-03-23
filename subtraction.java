import java.util.Scanner;

public class subtraction {
    //main method
    public static void main(String[] args) {

        //declaring and initializing the scanner
        Scanner in = new Scanner(System.in);

        //asking the user to enter the first number
        System.out.print("Kindly enter the first number: ");

        //taking in the input for the smaller number, and storing the same in a
        double a = in.nextDouble();

        //asking the user to enter the second number
        System.out.print("\nKindly enter the second number: ");

        //taking in the input for the second number, and storing the same in b
        double b = in.nextDouble();

        //calculating the difference between the second, and the first number, and storing it in sub
        double sub = b - a;

        //printing the result
        System.out.println("\nThe difference between the latter and the former number is: " + sub);
    }
}
