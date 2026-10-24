  public abstract class BaseEquipment implements KitchenEquipment {

    protected  boolean on = false;
    protected int intensity = 1;

    /**
     * Esta clase abstracta tiene las propiedades que las clases hijas usan en común
     * implementa la interface que las clases hijas deben implementar
     * Esto hace que el codigo sea menos repetitivo
     *
     * */

    protected abstract String getName();

      @Override
      public void turnOn() {
          on = true;
          System.out.println(getName() + " encendidx ");
      }

      @Override
      public void turnOff() {
          on = false;
          System.out.println(getName() + " Apadx ");
      }

      @Override
      public void adjustIntensity() {
          if(on && intensity <5){
              intensity ++;
              System.out.println(" Intensidad " + getName() + ":" + intensity);
          }
      }
  }
