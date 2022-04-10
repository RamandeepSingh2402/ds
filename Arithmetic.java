import java.util.Scanner;

public class Arithmetic {
    //main method
    public static void main(String[] args) {

        //importing the scanner class
        Scanner in = new Scanner(System.in);

        //taking in the input of the first integer
        int first = in.nextInt();

        //taking in the input of the second integer
        int second = in.nextInt();

        //creating an object of the Sum class, and passing in the values entered by the user
        Add sum = new Add(first, second);

        //creating an object of the Sub class, and passing in the values entered by the user
        Minus sub = new Minus(first,second);

        //printing the sum of the two numbers
        System.out.println("The sum of the two numbers entered by you is: " + sum.returnAdd());

        //printing the difference of the two numbers
        System.out.println("The difference of the two numbers entered by you is: " + sub.returnMinus());
    }
}
//class Add
class Add{
    //instance variables
    int res;
    public Add(int a, int b){
        this.res = a + b;
    }
    public int returnAdd(){
        return res;
    }
}

//class Minus
class Minus{
    //instance variables
    int sum;
    public Minus(int first, int second){
        sum= first-second;
    }
    public int returnMinus(){
        return sum;
    }
}
