public class CoffeeMaker  extends  BaseEquipment{

  /**
   * Cafeteria
   * */

  @Override
  protected String getName() {
      return "Cafeteria";
  }

    @Override
    public void prepare() {
        if (on) {
            System.out.println("Preparando cafe con intensidad " +
                    intensity + ".");
        }
    }



}
