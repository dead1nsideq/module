public class Lieutenant extends General {
    private String name;
    private boolean status;
    public Lieutenant() {
        this.name = "unknown";
        this.status = false;
    }
    public Lieutenant(String name, boolean status) {
        this.name = name;
        this.status = status;
    }
    @Override
    public boolean canFight() {
        return false;
    }

    @Override
    public void report() {
        System.out.println("smth Letinaunt report");
    }
}
