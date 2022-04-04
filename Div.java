import java.util.Scanner;

public class Div {

    //main method
    public static void main(String[] args) {

        //importing the scanner class
        Scanner in = new Scanner(System.in);

        //prompting the user to enter the integer numerator
        System.out.print("Kindly enter the integer numerator: ");

        //taking in the input of the numerator
        int num = in.nextInt();

        //prompting the user to enter the integer denominator
        System.out.print("\nKindly enter the integer denominator: ");

        //taking in the input of the denominator
        int den = in.nextInt();

        //creating an object div of the type DivResult
        DivResult div = new DivResult(num, den);

        //printing the result of the division by invoking the getter method of DivResult
        System.out.println("\nThe result of the division is: " + div.getResult());
    }
}

//DivResult class
class DivResult{

    //instance variable
    private int result;

    //constructor of the DivResult class
    public DivResult(int num, int den){
        this.result = num/den;
    }

    //getter method, which returns the integer result of the division
    public int getResult() {
        return result;
    }
}
