public class On extends OrState{
    public OrState operation;
    public OrState mode;
    public AirConditioner contex;
    public boolean setR;
    public boolean setC;
    public On(AirConditioner airConditioner) {
        this.contex = airConditioner;
        setR = false;
    }
    @Override
    public void entry(){
        if(setR){
            setState(operation);
            setR=false;
        }
        else if(setC) {
            setState(mode);
            setState(operation);
            setC=false;
        }
        else {
            System.out.println("ON");
            AirConditioner.c_temp = 25;
            AirConditioner.r_temp = 25;
            mode = new Mode(this);
            operation = new Operation(this);
        }
    }
    @Override
    public void setR_temp(){
        setR = true;
    }

    public void setC_temp(){
        setC = true;
    }

}
