public class Squezeer extends BaseEquipment{
    @Override
    protected String getName() {
        return "Exprimidor";
    }

    @Override
    public void prepare() {
        if (on) {
            System.out.println("Exprimiendo ingredientes a velocidad " +
                    intensity + ".");
        }
    }
}
