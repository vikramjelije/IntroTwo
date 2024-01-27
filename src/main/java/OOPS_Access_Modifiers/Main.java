package OOPS_Access_Modifiers;

public class Main {
    public static void main(String args[]) {
        Human obj = new Human();
        //default variable accessible within package
        obj.age = 21;

        //interesting behaviour with protected --> accessible within a package
        obj.weight = 50;
    }
}
