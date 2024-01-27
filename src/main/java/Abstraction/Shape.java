package Abstraction;

public abstract class Shape {

    String color;

    public Shape() {
        System.out.println("Inside Shape constructor");
        this.color = "BLUE";
    }

    public abstract int area();

    public static void main (String args[]) {
        Square sq = new Square();

//        We cannot create an object of shape as it is an abstract class
//        Shape sh = new Shape();

        System.out.println(sq.area());
    }
}

class Square extends Shape {
    int side;

    public Square() {
        super();
        System.out.println("Inside Square constructor");
        this.side = 10;
    }

    //Override annotation makes sure that the overridden method signature is correct
    @Override
    public int area() {
        return side*side;
    }
}
