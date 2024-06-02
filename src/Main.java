public class Main {
    public static void main(String[] args) {

        SUV fortuner = new SUV("Fortuner", false);
        fortuner.move(40,0);
        fortuner.accelerate(20);
        System.out.println("Current Speed : " + fortuner.getCurrentSpeed());
        System.out.println("Current Gear : " + fortuner.getCurrentGear());
    }
}
