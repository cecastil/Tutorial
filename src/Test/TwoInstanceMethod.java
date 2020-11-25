package Test;

public class TwoInstanceMethod {
    public static void main(String[] args) {
        Chair metalChair = new Chair();
        metalChair.legs = 12;
        metalChair.material = "Metal";

        Chair woodChair = new Chair();
        woodChair.legs = 15;
        woodChair.material = "Wood";

        System.out.println(metalChair.legs + " " + metalChair.material);
        System.out.println(woodChair.legs + " " + woodChair.material);
    }

}
