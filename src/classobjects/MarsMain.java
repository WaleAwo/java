package classobjects;

public class MarsMain {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();
        spirit.status = "exploring";
        spirit.speed = 2;
        spirit.temperature = -60;

        spirit.showAttributes();
        System.out.println("Increase speed to 3.");
        spirit.speed = 3;
        spirit.showAttributes();
        System.out.println("Changing temperature to -90.");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Checking the temperature.");
        spirit.checkTemperature();
        spirit.showAttributes();

        MarsRobot opportunity = new MarsRobot();
        opportunity.status = "exploring";
        opportunity.speed = 3;
        opportunity.temperature = -45;

        opportunity.showAttributes();
    }
}
