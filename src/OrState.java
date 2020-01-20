public class OrState extends State {
    // THIS IS THE CURRENT STATE
    public State state;

    // IN EVERY TRANSITION, ACTIVATE ENTRY AND EXIT
    public void setState(State st){
        if(state != null)
            state.exit();
        this.state = st;
        state.entry();
    }

    public State getState(){
        return this.state;
    }

    protected void setR_temp() {
    }
    protected void setC_temp() {
    }
}
