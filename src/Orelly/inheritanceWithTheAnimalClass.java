package Orelly;

public class inheritanceWithTheAnimalClass {
    public static void main (String[] args){

        new Cat("cat");
        new Dog("dog" );

    }
    public static class Animal{
        private String type;
        public Animal (String type){
            this.type=type;
        }
        public void emitSound(){
            System.out.println(type + " sound!");
        }
    }

    static class Cat extends Animal{
        public Cat (String type){
            super(type);
            super.emitSound();
        }
    }
    static class Dog extends Animal{
        public Dog (String type){
            super(type);
            super.emitSound();
        }

    }
}
