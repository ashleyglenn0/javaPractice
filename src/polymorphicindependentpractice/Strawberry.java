package polymorphicindependentpractice;

public class Strawberry extends Fruit {
    public Strawberry(){
        this.setCalories(200);
    }

    @Override
    public void makeJuice() {
        System.out.println("Strawberry juice is made");
    }
    public void cutStrawberries(){
        System.out.println("Fresh sliced strawberries");
    }
    public void pressStrawberries(){
        System.out.println("Strawberries are pressed");
    }
}
