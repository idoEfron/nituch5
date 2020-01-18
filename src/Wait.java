public class Wait extends State {
    public AirConditioner context;

    public Wait(AirConditioner airConditioner) {
        this.context = airConditioner;
    }

    @Override
    public void entry(){
        System.out.println("WAITING 30 SECONDS");
        context.setState(context.on);
    }
}
