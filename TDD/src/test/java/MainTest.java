import org.example.Main;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MainTest {
    @Test
    public void compare() {
        Main main = new Main();
        int value = main.compare(2,1);
        assertEquals(1, value);
    }
}
