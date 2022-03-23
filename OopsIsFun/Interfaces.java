package OopsIsFun;

public class Interfaces implements car, person {
    public static void main(String[] args) {

    }

    @Override
    public void start() {
        System.out.println("My car is starting.");
    }

    public void stop(){
        System.out.println("The car is stopped.");
}
    public void walk(){
        System.out.println("The car is walking as well!");
    }

}
interface car{
    void start();
    void stop();
}
interface person{
    void walk();
}
