public class CreateDivision extends Human{
    @Override
    public CreateDivision createSoldier() {
        CreateDivision param;
        if (this.getClass().getSimpleName().equals("General")) {
            return new General();
        } else if (this.getClass().getSimpleName().equals("Soldier")) {
            return new Soldier();
        } else {
            return new Lieutenant();
        }
    }

    @Override
    public boolean canFight() {
        return false;
    }

    @Override
    public void report() {

    }

}
