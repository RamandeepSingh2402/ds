import java.util.Scanner;

public class sub {

    //main method
    public static void main(String[] args) {
        //importing the scanner class
        Scanner in = new Scanner(System.in);

        //prompt for the user to enter the large number first
        System.out.print("Enter the larger number: ");

        //storing the value entered by the user in the variable first
        int first = in.nextInt();

        //prompt for the user to enter the smaller number
        System.out.print("\nEnter the smaller number: ");

        //storing the value entered by the user in the varibable second
        int second = in.nextInt();

        //creating an object of the type Subt
        Subt sub = new Subt(first, second);

        //getting the result of the subtraction, and storing the same in the variable result
        int result = sub.getSubt();

        //printing the result of the subtraction to the console
        System.out.println("The result of the subtraction is: " + result);
    }
}
//Subt class
class Subt{
    //instance variable
    protected int subt;

    //constructor for the Subt class
    public Subt(int first, int second){
     this.subt = first -second;
    }

    //getter method for the result of the subtraction
    public int getSubt(){
        return this.subt;
    }
}
