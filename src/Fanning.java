public class Fanning extends State {
    public OrState operation;
    public Fanning(Operation operation) {
        this.operation = operation;
    }

    @Override
    public void entry(){
        System.out.println("OPERATION-FANNING (120 SECONDS AT LEAST)");
    }
}
