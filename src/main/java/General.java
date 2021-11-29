public class General implements ReadyToFight{
    private String name;
    private boolean status;
    public General (String name,boolean status) {
        this.name = name;
        this.status = status;
    }
    public General () {
        this.name = "unknown";
        this.status = false;
    }
    @Override
    public boolean canFight() {
        if (status) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void report() {
        System.out.println("smth Genereal report");
    }
}
