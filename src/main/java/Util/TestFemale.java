package Util;

public class TestFemale {
    public static void main (String args[]) {
        Female fm = new Female();

        // Not accessible as protected member private in child class
//        System.out.println(fm.weight);
    }
}
