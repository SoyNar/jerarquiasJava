public class TestAnalysis {

    public static void main(String[] args)

    {
        /**
         * prueba del preparador de bebidas
         * */
        BeverageMaker beverageMaker = new BeverageMaker(new CoffeeMaker(), new Blender());
        beverageMaker.prepareBreakfast();
        beverageMaker.turnEverythingOff();
        System.out.println("El preparador esta amarrado a Cafetera y Licuadora porque las crea con new dentro de su constructor, y para cambiar un equipo hay que modificar su codigo.");



    }
}
