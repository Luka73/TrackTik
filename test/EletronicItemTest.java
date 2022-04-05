import entity.EletronicItem;
import entity.Television;
import org.junit.Test;

public class EletronicItemTest {

    @Test
    public void addExtraTest() {
        Television television1 = new Television(229.97, true);
        television1.addExtra(TestUtils.getRemoteController());
        television1.addExtra(TestUtils.getRemoteController());

        System.out.println("teste");
    }
}
