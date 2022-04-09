import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = in.nextInt();
        Sum add = new Sum(first, second);

        Sub sub = new Sub(first,second);

        System.out.println("The sum of the two numbers entered by you is: " + add.returnSum());
    }
}
class Sum{
    int a;
    int b;
    int sum;
    public Sum(int a, int b){
        this.a = a;
        this.b = b;
        this.sum = a + b;
    }
    public int returnSum(){
        return this.sum;
    }
}
