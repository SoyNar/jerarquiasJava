import java.util.List;

public class BeverageStation {

    /**
     * preparador de bebidas multiple
     * */


    private final List<KitchenEquipment> equipmentList;

    public BeverageStation(List<KitchenEquipment> equipmentList)
    {
         this.equipmentList = equipmentList;

    }

    public  void  prepareBreakfast()
    {
        System.out.println("________________________iniciando preparacion del desayuno___________________");

        for (KitchenEquipment equipment: equipmentList)
        {
            equipment.turnOn();
            equipment.prepare();

        }
        System.out.println("_______________DEsayuno listo_____________________________________________________");

    }

    public void turnEverythingOff()
    {
        System.out.println("__________________________________________Apagando equipos__________________________________________");

        for (KitchenEquipment equipment: equipmentList)
        {
            equipment.turnOff();

        }
        System.out.println("_____________________________________________Equipos apagados_____________________________________________");

    }


}
