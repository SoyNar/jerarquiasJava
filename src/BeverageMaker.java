public class BeverageMaker {

 /**
  * Preparador de bebidas
  * */
    private KitchenEquipment equipmentOne;
    private KitchenEquipment equipmentTwo;
    public BeverageMaker(KitchenEquipment equipmentOne, KitchenEquipment equipmentTwo) {
        this.equipmentOne = equipmentOne;
        this.equipmentTwo = equipmentTwo;

    }
    public void prepareBreakfast() {
        System.out.println("Iniciando preparacion del desayuno...");
        equipmentOne.turnOn();
        equipmentOne.prepare();
        equipmentTwo.turnOn();
        equipmentTwo.prepare();
        System.out.println("Desayuno listo.");
    }
    public void turnEverythingOff() {
        System.out.println("Apagando equipos...");
        equipmentOne.turnOff();
        equipmentTwo.turnOff();
        System.out.println("Equipos apagados.");
    }
}
