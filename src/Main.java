public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        SUV fortuner = new SUV("Fortuner", false);
        fortuner.move(40,0);
        fortuner.accelerate(20);
       // fortuner.accelerate(-60);
        System.out.println("Current Speed : " + fortuner.getCurrentSpeed());
        System.out.println("Current Gear : " + fortuner.getCurrentGear());
    }
}