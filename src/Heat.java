public class Heat extends State {
    public OrState mode;
    public Heat(Mode mode) {
        this.mode = mode;
    }
    @Override
    public void entry(){
        System.out.println("MODE-HEAT");
    }
}
