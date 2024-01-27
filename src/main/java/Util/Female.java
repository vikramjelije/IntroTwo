package Util;

import OOPS_Access_Modifiers.Human;

public class Female extends Human{

    void print() {
        Human obj =  new Human();

        //Not Accessible because class is in different package
//        System.out.println(obj.weight);
//        System.out.println(obj.age);
    }

    void printThisWeight() {
        Female fm = new Female();
        System.out.println(fm.weight);
        System.out.println(this.weight);
    }

    public static void main () {
    }
}
