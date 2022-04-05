import entity.Controller;

public class TestUtils {

    public static Controller getRemoteController() {
        return new Controller(12.10, false);
    }

    public static Controller getWiredController() {
        return new Controller(9.10, true);
    }
}
