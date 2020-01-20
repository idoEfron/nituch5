public class Mode extends OrState {
    public OrState on;
    public State heat;
    public State cool;
    public State currState;

    public Mode(On on) {
        this.on = on;
        this.heat = new Heat(this);
        this.cool = new Cool(this);
        this.currState = cool;
        this.setState(cool);
    }

    @Override
    public void entry() {
        if (currState instanceof Cool) {
            if (AirConditioner.c_temp > AirConditioner.r_temp + 5) {
                setState(heat);
                currState = heat;
            }
        } else if (currState instanceof Heat) {
            if (AirConditioner.c_temp < AirConditioner.r_temp - 5) {
                setState(cool);
                currState = cool;
            }
        }
    }
}
