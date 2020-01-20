public class Main {
    public static void main(String [] args)
    {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        airConditioner.setR_temp(27);
        airConditioner.setC_temp(33);
        airConditioner.turnOn();
    }
}
