package polymorphicindependentpractice;

public class Apple extends Fruit {

    public Apple(){
        this.setCalories(100);
    }
    @Override
    public void makeJuice(){
        System.out.println("Apple Juice is made");
    }
    public void removeSeeds(){
        System.out.println("Seeds are removed");
    }
    public void sliceApple(){
        System.out.println("Apple is sliced");
    }
}
