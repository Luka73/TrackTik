import entity.Console;
import entity.Controller;
import entity.Microwave;
import entity.Television;
import org.junit.Test;

class Scenario1Test {
    @Test
    void test1() {
        Console console = new Console(9.10, true);
        console.addExtra(getRemoteController());
        console.addExtra(getRemoteController());
        console.addExtra(getWiredController());
        console.addExtra(getWiredController());

        Television television1 = new Television(229.97, true);
        television1.addExtra(getRemoteController());
        television1.addExtra(getRemoteController());

        Television television2 = new Television(322.99, true);
        television2.addExtra(getRemoteController());

        Microwave microwave = new Microwave(98.20, true);

    }

    private Controller getRemoteController() {
        return new Controller(12.10, false);
    }

    private Controller getWiredController() {
        return new Controller(9.10, true);
    }
}
