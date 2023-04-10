import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        HotWaterVendingMachine machineHotWater = new HotWaterVendingMachine();
        machineHotWater.addProduct(new HotWater("hot water 1l", 300.0, 1, 40));
        machineHotWater.addProduct(new HotWater("hot water 2l", 300.0, 2, 20));
        machineHotWater.addProduct(new HotWater("hot water 2l", 300.0, 2, 15));
        machineHotWater.addProduct(new HotWater("hot water 2l", 300.0, 2, 40));
        machineHotWater.addProduct(new HotWater("hot water 3l", 200.0, 3, 50));

        machineHotWater.prinntProducts();
        System.out.println("---");
        machineHotWater.sort(new HotWaterComparator("temperature"));
        machineHotWater.prinntProducts();

        for (Object item : machineHotWater){
            System.out.println("iterated: " + item);
        }
    }
}