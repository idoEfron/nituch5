public class On extends OrState{
    public OrState operation;
    public OrState mode;
    public AirConditioner contex;

    public On(AirConditioner airConditioner) {
        this.contex = airConditioner;

    }

    @Override
    public void entry(){
        System.out.println("ON");
        AirConditioner.c_temp = 25;
        AirConditioner.r_temp = 25;
        mode = new Mode(this);
        operation = new Operation(this);
    }
}
