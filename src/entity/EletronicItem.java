package entity;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class EletronicItem implements Comparable<EletronicItem>{
    private double price;
    private boolean wired;
    private EletronicItems extra;

    protected EletronicItem() {

    }
    protected EletronicItem(double price, boolean wired) {
        this.price = price;
        this.wired = wired;
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

    protected int maxExtras() {
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

    public double getTotalPrice() {
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.DOWN);
        double total = price;
        if(this.extra != null) {
            for(EletronicItem i : this.extra.getItems()) {
                total += i.getPrice();
            }
        }
        return Double.parseDouble(df.format(total));
    }

    @Override
    public int compareTo(EletronicItem other) {
        return Double.compare(this.getPrice(), other.getPrice());
    }
}
