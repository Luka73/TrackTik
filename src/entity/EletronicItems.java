package entity;

import java.util.ArrayList;
import java.util.List;

public class EletronicItems {
    private List<EletronicItem> items;

    public EletronicItems(List<EletronicItem> items) {
        this.items = new ArrayList<>();
        this.items.addAll(items);
    }

    public List<EletronicItem> getItems() {
        return items;
    }

    public void addItem(EletronicItem item) {
        this.items.add(item);
    }

    public int getSize() {
        return items.size();
    }

    public List<EletronicItem> sortByPrice(List<EletronicItem> items) {
        items.sort(new EletronicItemComparator());
        return items;
    }

}
