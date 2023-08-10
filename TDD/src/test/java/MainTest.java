import org.example.Main;
import org.junit.Test;

import java.util.Arrays;

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

    /*
     return the first pair of two prime numbers spaced with a gap of gap between the limits m, n if these numbers exist otherwise null
     */
    @Test
    public void gapInPrimes() {
        Main main = new Main();
        System.out.println("Fixed Tests");
        assertEquals("[101, 103]", Arrays.toString(main.gapInPrimes(2,100,110)));
        assertEquals("[103, 107]", Arrays.toString(main.gapInPrimes(4,100,110)));
        assertEquals(null, main.gapInPrimes(6,100,110));
        assertEquals("[359, 367]", Arrays.toString(main.gapInPrimes(8,300,400)));
        assertEquals("[337, 347]", Arrays.toString(main.gapInPrimes(10,300,400)));
    }
}
