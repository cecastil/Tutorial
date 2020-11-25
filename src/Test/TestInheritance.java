package Test;

public class TestInheritance {
    public static void main(String[] args) {

        Chihuahua chihuahua = new Chihuahua();
        chihuahua.soundMade();

    }
    public static abstract class Perro{
        String sound;
        public abstract void soundMade ();
    }
    public static class Chihuahua extends Perro{
        String sound = "Wau wau wau wau";

        @Override
        public void soundMade() {
            System.out.println(sound);
        }
    }
}
