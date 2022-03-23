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

    }
}
class Person{
    int age;
    String name;
}
