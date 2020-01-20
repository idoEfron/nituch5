public class Cooling extends State {
    public OrState operation;
    public Cooling(Operation operation) {
        this.operation = operation;
    }

    @Override
    public void entry(){
        System.out.println("OPERATION-COOLING");
    }
}
