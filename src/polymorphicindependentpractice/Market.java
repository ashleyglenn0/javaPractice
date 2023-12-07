package polymorphicindependentpractice;

public class Market {
    public static void main(String[] args){
        Apple appleJuice = new Apple();
        appleJuice.makeJuice();
        appleJuice.sliceApple();
        appleJuice.removeSeeds();
        Strawberry strawberryJuice = new Strawberry();
        strawberryJuice.makeJuice();
        strawberryJuice.cutStrawberries();
        strawberryJuice.pressStrawberries();

        Fruit strawberryAppleMix = new Apple();
        strawberryAppleMix.makeJuice();
        ((Apple) strawberryAppleMix).sliceApple();

        squeeze(appleJuice);
    }
    public static void squeeze(Fruit fruit){
        System.out.print("Squeezing...");
        fruit.makeJuice();
    }
}
