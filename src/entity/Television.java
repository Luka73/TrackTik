package entity;

public class Television extends EletronicItem {

    public Television() {
    }

    public Television(double price, boolean wired) {
        super(price, wired);
    }

    @Override
    public int maxExtras() {
        return Integer.MAX_VALUE;
    }
}
