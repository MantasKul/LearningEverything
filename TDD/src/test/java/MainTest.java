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

    // Binary search test
    @Test
    public void binarySearch() {
        Main main = new Main();
        int arr[] = {2, 3, 4, 5, 10, 10, 15};
        assertEquals(0, main.binarySearch(arr, 2));
        assertEquals(-1, main.binarySearch(arr, 6));
        assertEquals(5, main.binarySearch(arr, 10));
    }
}
