package Orelly;

public class creatingPrivateFieldsAndMethods {
    public static void main (String[] args){

        Car car = new Car(new Engine());
        car.accelerate();
    }

    static class Engine{
        private double engineUsage;
    }
    static class Car{
        private Engine engine;//instance of the class Engine
        Car(Engine engine){ //creating a constructor
            this.engine = engine;
        }
        public void accelerate(){ //creating a method
            engine.engineUsage+= 20;
            System.out.println(engine.engineUsage);
        }
    }
}
