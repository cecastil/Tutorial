package Orelly;

public class UsingPolymorphismWithTheAnimalMethods {
    public static void main(String[] args) {

        //overriding methods is essential when we are working with inheritance.
        //Let's create the Animal class and then override the emitSound method in the Dog and Cat classes.

        AnimalInvoker animalInvoker = new AnimalInvoker();
        Animal animal = new Animal();
        Animal animalDog = new Dog();
        Animal animalCat = new Cat();
        Dog dog = new Dog();
        Cat cat = new Cat();

    //we are using an orchestrator class animalInvoker that will be responsible to invoke the emitSound method
        //for any Animal.
        animalInvoker.perforAction(animal); //we are not making use of polymorphism, we are declaring intantiating the Animal class
        animalInvoker.perforAction(dog);
        animalInvoker.perforAction(animalCat);
        animalInvoker.perforAction(animalDog);
        animalInvoker.perforAction(cat);
    }

    public static class Animal{
        public void emitSound(){
            System.out.println("Any animal sound");
        }
    }
    static class Dog extends Animal{
        @Override
        public void emitSound(){
            System.out.println("Woof-woof");
        }
    }
    static class Cat extends Animal{
        //The only way to invoke a specific method when we only have access to the parent class is to use casting
        //because that's the only way to ensure the Animal instance really has the slash method from Cat.
        public void slash(){
            System.out.println("The cat slash");
        }
        @Override
        public void emitSound(){
            System.out.println("meow");
        }
    }

    static class AnimalInvoker {
        public void perforAction (Animal animal){
            if (animal instanceof Cat) { //If we wanna function this piece of code, we need to eliminate the
                Cat cat = (Cat) animal;  //animal.emitSound().
                cat.slash();
            }
            //animal.emitSound();
        }

    }
}
