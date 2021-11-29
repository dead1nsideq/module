public class CreateHuman {
    public static CreateDivision createDivision(Classification.types type) {
        switch (type) {
            case GENERAL: return new General();
            case LITENAUNT: return new CreateDivision()
        }
    }
}
