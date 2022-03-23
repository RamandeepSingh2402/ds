package encapsulation;

import java.util.SortedMap;

public class EncapsulationIntro {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setPrice(31);
        System.out.println(l1.getPrice());
    }
}
class Laptop{
    int ram;
    protected int price;


    public void setPrice(int price){
        //you can check if the user is an admin or not
        boolean isAdmin = true;
        if(!isAdmin){
            System.out.println("You cannot set the price.");
        }
        else {
            this.price = price;
        }
    }

    public int getRam() {
        return ram;
    }

    public int getPrice() {
        return price;
    }
}
