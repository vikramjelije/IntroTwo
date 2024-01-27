package Util;

import OOPS_Access_Modifiers.Human;

public class Calculate {
    public static void main(String args[]) {
        Human obj = new Human();
        //default variable not-accessible out side of package
//        obj.age = 21;

        //interesting behaviour with protected --> not-accessible outside a package
//        obj.weight = 50;
    }
}
