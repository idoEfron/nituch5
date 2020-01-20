public class Heating extends State {
    public OrState operation;
    public Heating(Operation operation) {
        this.operation = operation;

    }
    @Override
    public void entry(){
        System.out.println("OPERATION-HEATING");
    }
}
