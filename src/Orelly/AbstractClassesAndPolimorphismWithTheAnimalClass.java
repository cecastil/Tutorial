package Orelly;

public class AbstractClassesAndPolimorphismWithTheAnimalClass {
    public static void main (String[] args){

        Animal dogAnimal = new Dog("woof-woof");
        Animal catAnimal = new Cat("meow");

        dogAnimal.emitSound();
        catAnimal.emitSound();


    }


     static class Dog extends Animal{ //When we use the modifier static, we are to associate the method with the class,
        String sound;
        Dog (String sound){
            this.sound = sound;
        }
        @Override
        public void emitSound(){
            System.out.println (sound);
        }
    }

     static class Cat extends Animal{
        String sound;
        Cat(String sound){
            this.sound = sound;
        }
        @Override
        public void emitSound(){
            System.out.println(sound);
        }
    }
}
    abstract class Animal {
    public abstract void emitSound();

}


