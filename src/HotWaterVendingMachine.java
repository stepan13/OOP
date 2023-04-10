import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class HotWaterVendingMachine extends VendingMachine implements Iterable{

    public ArrayList getProduct(String searchName, Integer volume, Integer temperature) {
        ArrayList<Product> tempList = this.getProduct(searchName, volume);

        ArrayList<Product> result = new ArrayList<>();
        for (Product tempItem : tempList) {
            HotWater item = (HotWater) tempItem;
            if (item.getTemperature().equals(temperature)) {
                result.add(tempItem);
            }
        }
        return result;
    }

    public void sort(HotWaterComparator comp){
        list.sort(comp);
    }

    @Override
    public Iterator iterator() {
        return list.iterator();
    }
}
