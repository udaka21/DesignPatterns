package BuilderDesignPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by udaka on 7/17/16.
 *
 */
class CDType {

    private List<Packing> items=new ArrayList<Packing>();

    void addItem(Packing packs) {
        items.add(packs);
    }

    public void getCost(){
        for (Packing packs : items) {
            packs.price();
        }
    }
    void showItems(){
        for (Packing packing : items){
            System.out.print("CD name : "+packing.pack());
            System.out.println(", Price : "+packing.price());
        }
    }


}
