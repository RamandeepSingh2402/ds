import java.util.Scanner;

public class sub {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the larger number: ");
        int first = in.nextInt();
        System.out.print("\nEnter the smaller number: ");
        int second = in.nextInt();
        Subt sub = new Subt(first, second);
        int result = sub.getSubt();

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
