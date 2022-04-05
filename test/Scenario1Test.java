import entity.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Scenario1Test {
    @Test
    public void test1() {
        Console console = new Console(9.10, true);
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
        List<EletronicItem> sortedItems = eletronicItems.sortByPrice(eletronicItems.getItems());

        System.out.println("teste");

    }


}
