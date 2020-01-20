public class Operation extends OrState {
    public OrState on;
    public State fanning;
    public State colling;
    public State heating;
    public State currState;

    public Operation(On on) {
        this.on = on;
        this.fanning = new Fanning(this);
        this.colling = new Cooling(this);
        this.heating = new Heating(this);
        this.setState(fanning);
        currState = fanning;
    }

    @Override
    public void entry() {
        if (currState instanceof Heating) {
            if (AirConditioner.r_temp >= AirConditioner.c_temp + 2) {
                setState(fanning);
                currState = fanning;
            }
        }
        if (currState instanceof Cooling) {
            if (AirConditioner.r_temp <= AirConditioner.c_temp - 2) {
                setState(fanning);
                currState = fanning;
            }
        }
        if (currState instanceof Fanning) {
            if (AirConditioner.r_temp >= AirConditioner.c_temp + 2) {
                setState(colling);
                currState = colling;
            } else if (AirConditioner.r_temp <= AirConditioner.c_temp - 2) {
                setState(heating);
                currState = heating;
            } else {//todo ido not sure of that
                setState(fanning);
                currState = fanning;
            }
        }
    }
}
