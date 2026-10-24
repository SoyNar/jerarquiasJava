public class Blender extends BaseEquipment {
    /**
     * Licuadora
     * */


    @Override
    protected String getName() {
        return "Licuadora";
    }

    public void prepare() {
        if (on) {
            System.out.println("Licuando ingrediente a velocidad " +
                    intensity + ".");
        }
    }


}



