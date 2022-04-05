package entity;

public class Console extends EletronicItem {

    public Console() {
    }

    public Console(double price, boolean wired) {
        super(price, wired);
    }

    @Override
    public int maxExtras() {
        return 4;
    }
}
