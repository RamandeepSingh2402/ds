import java.util.Scanner;

public class mul {
    //main method
    public static void main(String[] args) {
        //importing scanner class
        Scanner in = new Scanner(System.in);

        //asking the user to enter the first integer
        System.out.print("Kindly enter the first integer: ");
        int first = in.nextInt();
        System.out.println("");
        System.out.print("Kindly enter the second integer: ");
        int second = in.nextInt();

        //creating an object mul of Multi
        Multi mul = new Multi(first,second);

        //calling for the result of multiplication
        int result = mul.getResult();

        //printing the result to the console
        System.out.println("The product of the two numbers entered by you is: " + result);
    }

}

//Multi class
class Multi{

    //instance variables of the Multi class
    int a;
    int b;
    int mul;
    //constructor of the Multi method
    public Multi(int a, int b){
        this.a = a;
        this.b = b;
        this.mul= a*b;
    }

    //getResult method of the Multi method
    public int getResult(){
        return this.mul;
    }
}
