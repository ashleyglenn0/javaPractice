package AbstractionPractice;

public abstract class Shape {
    abstract double calculateArea(); //abstract method. only needs the return value and a signature. implementation will be done in subclass

    public void print(){ //method will still operate the same way
        System.out.println("I am a shape");
    }
}
