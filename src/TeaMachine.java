public class TeaMachine extends  BaseEquipment{

    @Override
    protected String getName() {
        return "Maquina de Té";
    }

    @Override
    public void prepare() {
        if (on) {
            System.out.println("Preparando té a intensidad " +
                    intensity + ".");
        }
    }
}
