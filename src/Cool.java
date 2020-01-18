public class Cool extends State {
    public OrState mode;
    public Cool(Mode mode) {
        this.mode = mode;
    }
    @Override
    public void entry(){
        System.out.println("MODE-COOL");
    }
}
