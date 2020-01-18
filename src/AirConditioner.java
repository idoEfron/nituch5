public class AirConditioner extends OrState{
    public OrState on;
    public State off;
    public State wait;
    public static double r_temp;
    public static double c_temp;

    public AirConditioner() {
        on= new On(this);
        off = new Off(this);
        wait = new Wait(this);
        this.setState(off);
    }

    public void turnOn(){
        this.setState(wait);
    }
    public void setR_temp(double r_temp){

    }
}
