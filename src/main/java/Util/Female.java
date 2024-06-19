package Util;

import OOPS_Access_Modifiers.Human;

public class Female extends Human{

    void print() {
        Human obj =  new Human();

        //Not Accessible because class is in different package
    //    System.out.println(obj.weight);
    //    System.out.println(obj.age);
    }

    void printThisWeight() {
        Female fm = new Female();
        //Below statements work as female is subclass of Human
        System.out.println(fm.weight);
        System.out.println(this.weight);
    }

    public static void main (String args[]) {
        Female fm1 = new Female();
        fm1.printThisWeight();
    }
}
