package abstractionpractice;

public class ShapeTester {
    public static void main(String [] args){
        Shape rectangle = new Rectangle(5, 7); // can not instantiate Shape. Shape is just the blueprint
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}
