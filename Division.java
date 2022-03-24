import java.util.Scanner;

public class Division {
    //main method
    public static void main(String[] args) {

        //declaring and initializing the Scanner class
        Scanner in = new Scanner(System.in);

        //asking the user to enter the numerator
        System.out.print("Kindly enter the numerator: ");

        //storing the value of numerator in num
        int num = in.nextInt();

        //asking the user to enter the denominator
        System.out.print("Kindly enter the denominator: ");

        //storing the value of denominator in den
        int den = in.nextInt();

        //calculating the division of numerator and denominator
        double div = (double)num/(double)den;

        //printing the divisor to the console
        System.out.println("The quotient of the entered numbers is: " + div);
    }
}
