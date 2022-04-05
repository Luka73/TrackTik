import entity.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Scenario1Test {

    private static final double DELTA = 1e-15;

    @Test
    public void test1() {
        Console console = new Console(89.10, true);
        console.addExtra(TestUtils.getRemoteController());
        console.addExtra(TestUtils.getRemoteController());
        console.addExtra(TestUtils.getWiredController());
        console.addExtra(TestUtils.getWiredController());

        Television television1 = new Television(229.97, true);
        television1.addExtra(TestUtils.getRemoteController());
        television1.addExtra(TestUtils.getRemoteController());

        Television television2 = new Television(322.99, true);
        television2.addExtra(TestUtils.getRemoteController());

        Microwave microwave = new Microwave(98.20, true);

        List<EletronicItem> items = new ArrayList<>();
        items.add(console);
        items.add(television1);
        items.add(television2);
        items.add(microwave);

        EletronicItems eletronicItems = new EletronicItems(items);
        List<EletronicItem> actual = eletronicItems.sortByPrice(eletronicItems.getItems());

        double totalPrice = 0;

        totalPrice += console.getTotalPrice();
        totalPrice += television1.getTotalPrice();
        totalPrice += television2.getTotalPrice();
        totalPrice += microwave.getTotalPrice();

        assertEquals(console.getPrice(), actual.get(0).getPrice(), DELTA);
        assertEquals(microwave.getPrice(), actual.get(1).getPrice(), DELTA);
        assertEquals(television1.getPrice(), actual.get(2).getPrice(), DELTA);
        assertEquals(television2.getPrice(), actual.get(3).getPrice(), DELTA);
        assertEquals(818.95, totalPrice, DELTA);
    }

    @Test
    public void test2() {
        Console console = new Console(89.10, true);
        console.addExtra(TestUtils.getRemoteController());
        console.addExtra(TestUtils.getRemoteController());
        console.addExtra(TestUtils.getWiredController());
        console.addExtra(TestUtils.getWiredController());

        double actual = console.getTotalPrice();

        assertEquals(131.49, actual, DELTA);
    }


}
