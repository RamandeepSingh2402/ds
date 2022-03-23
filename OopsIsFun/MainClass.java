package OopsIsFun;

import encapsulation.EncapsulationIntro;

public class MainClass {
    public static void main(String[] args) {

//        Person p1 = new Person();
//        p1.age = 20;
//        p1.name = "Raman";
//
//        System.out.println(p1.age + " " + p1.name);
//
//        Person p2 = new Person();
//        p2.age = 21;
//        p2.name = "Aman";
//
//        System.out.println(p2.age + " " + p2.name);
//
//        Person p3 = new Person(22,"Amandeep");
//
//        System.out.println(p3.age + " " + p3.name);
//        p1.eat();
//        p2.walk();
//        p2.walk(2);
//
//        Developer d1 = new Developer(24, "Raman");
//        d1.walk();



    }
}
class Developer extends Person{
    public Developer(int age, String name){
        super(age, name);
    }
    void walk(){
        System.out.println("Developer " + name + " is walking.");
    }
}
class Person{
    int age;
    String name;


    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    void walk(){
        System.out.println(name + " is walking.");
    }

    void eat(){
        System.out.println(name + " is eating.");
    }

    void walk(int steps){
        System.out.println(name + " walked " + steps + " steps.");
    }

    void doWork(){
        System.out.println("The person is working.");
    }
}
