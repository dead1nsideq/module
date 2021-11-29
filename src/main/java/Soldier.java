public class Soldier extends Lieutenant {
    private String name;
    private boolean status;
    public Soldier () {
        this.name = "unknown";
        this.status = false;
    }
    public Soldier (String name,boolean status) {
        this.name = name;
        this.status = status;
    }
    @Override
    public boolean canFight() {
        return false;
    }

    @Override
    public void report() {
        System.out.println("smth Soldier report");
    }
}
