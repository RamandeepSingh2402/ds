import java.util.Scanner;

public class Div {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int den = in.nextInt();

        DivResult div = new DivResult(num, den);
    }
}
class DivResult{
    private int result;
    public DivResult(int num, int den){
        this.result = num/den;
    }
}
