package OopsIsFun;

public class MainClass {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 20;
        p1.name = "Raman";

        System.out.println(p1.age + " " + p1.name);

        Person p2 = new Person();
        p2.age = 21;
        p2.name = "Aman";

        System.out.println(p2.age + " " + p2.name);

        p1.eat();
        p2.walk();
        p2.walk(2);


    }
}
class Person{
    int age;
    String name;
    void walk(){
        System.out.println(name + " is walking.");
    }
    void eat(){
        System.out.println(name + " is eating.");
    }
    void walk(int steps){
        System.out.println(name + " walked " + steps + " steps.");
    }
}
