public class TestBeverageMaker {

    public static void main(String[] args){

        System.out.println("-----------------------------------------------");
        System.out.println("Configuracion UNO");
        System.out.println("-----------------------------------------------");
        BeverageMaker ConfigurationOne = new BeverageMaker(new Squezeer(),new TeaMachine());
        ConfigurationOne.prepareBreakfast();
        ConfigurationOne.turnEverythingOff();
        System.out.println("-----------------------------------------------");

        System.out.println("Configuracion Dos");
        System.out.println("-----------------------------------------------");

        BeverageMaker configurationTwo = new BeverageMaker( new Blender(),new CoffeeMaker());
        configurationTwo.prepareBreakfast();
        configurationTwo.turnEverythingOff();
        System.out.println("-----------------------------------------------");
        System.out.println("Configuracion Tres");
        System.out.println("-----------------------------------------------");
        BeverageMaker configurationThree = new BeverageMaker(new Blender(),new Squezeer());
        configurationThree.prepareBreakfast();
        configurationThree.turnEverythingOff();
        System.out.println("-----------------------------------------------");



    }
}
