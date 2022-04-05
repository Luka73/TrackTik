package entity;

import java.util.ArrayList;

public class EletronicItem {
    private double price;
    private boolean wired;
    private EletronicItems extra;

    protected EletronicItem() {

    }
    protected EletronicItem(double price, boolean wired) {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWired() {
        return wired;
    }

    public void setWired(boolean wired) {
        this.wired = wired;
    }

    private int maxExtras() {
        return 0;
    }

    public void addExtra(EletronicItem extra) {
        if(this.extra == null) {
            this.extra = new EletronicItems(new ArrayList<>());
        }

        if(this.extra.getSize() < maxExtras()) {
            this.extra.addItem(extra);
        }
    }


}