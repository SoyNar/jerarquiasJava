import java.util.ArrayList;
import java.util.List;

public class TestBeverageStation {


    public static void main(String[] args){


        Blender blender = new Blender();
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        Squezeer squezeer = new Squezeer();
        List<KitchenEquipment> equipments = new ArrayList<>();
        equipments.add(blender);
        equipments.add(squezeer);
        equipments.add(coffeeMaker);

        BeverageStation  beverageStation = new BeverageStation(equipments);

        beverageStation.prepareBreakfast();
        beverageStation.turnEverythingOff();

    }
}
