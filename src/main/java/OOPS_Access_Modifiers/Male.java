package OOPS_Access_Modifiers;

public class Male extends Human {

    void print() {
        Human obj =  new Human();

        //Protected is accessible because class is in same package
        System.out.println(obj.weight);

        System.out.println(this.weight);
    }
}
