package entity;

import java.util.Comparator;

public class EletronicItemComparator implements Comparator<EletronicItem> {

    @Override
    public int compare(EletronicItem first, EletronicItem second) {
        return Double.compare(first.getPrice(), second.getPrice());
    }
}
