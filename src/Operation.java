public class Operation  extends  OrState{
    public OrState on;
    public State fanning;
    public State colling;
    public State heating;

    public Operation(On on) {
        this.on = on;
        this.fanning = new Fanning(this);
        this.colling = new Cooling(this);
        this.heating = new Heating(this);
        this.setState(fanning);
    }

    @Override
    public void entry(){
    }
}
