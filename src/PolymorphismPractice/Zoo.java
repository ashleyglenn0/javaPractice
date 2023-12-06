package PolymorphismPractice;

public class Zoo {
    public static void main(String[] args){
        Dog rocky = new Dog(); //regular instance of a dog that inherits from animal
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog(); //polymorphic instance that is of the Animal superclass and the dog subclass
        sasha.makeSound(); //will use the overridden dog make sound
        feed(sasha);

        sasha = new Cat(); //can be changed to cat instance due to both dog and cat inheriting from animal
        sasha.makeSound(); // will now make cat sound
        ((Cat) sasha).scratch(); //does not have access to the scratch method until it is cast to cat. This does NOT change the original object
        feed(sasha);
    }

    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("Here is your dog food");
        } else if (animal instanceof Cat){
            System.out.println("Here is your cat food");
        }
    }
}
