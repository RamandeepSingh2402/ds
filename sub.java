import java.util.Scanner;

public class sub {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = in.nextInt();
        System.out.println(" ");
        System.out.println("Enter the second number: ");
        int second = in.nextInt();
        Subt sub = new Subt(first, second);
        int result = sub.getSubt();

        System.out.println("The result of the subtraction is: " + result);
    }
}
class Subt{

    protected int subt;
    public Subt(int first, int second){
     this.subt = first -second;
    }

    public int getSubt(){
        return this.subt;
    }
}