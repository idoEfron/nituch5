public class AirConditioner extends OrState{
    public OrState on;
    public State off;
    public State wait;
    public static int r_temp;
    public static int c_temp;
    public State currState;

    public AirConditioner() {
        on= new On(this);
        off = new Off(this);
        wait = new Wait(this);
        this.setState(off);
        currState =null;
    }

    public void turnOn(){
        if(currState==null) {
            currState = wait;
            this.setState(wait);
        }else {
            this.setState(off);
            currState =null;
        }
    }

    public void setR_temp(int r_temp){
    this.r_temp = r_temp;
    on.setR_temp();
        System.out.println("set r_temp to " + AirConditioner.r_temp);
        this.setState(on);
    }

    public void setC_temp(int c_temp){
        this.c_temp = c_temp;
        on.setC_temp();
        System.out.println("set c_temp to " + AirConditioner.c_temp);
        this.setState(on);
    }
}
