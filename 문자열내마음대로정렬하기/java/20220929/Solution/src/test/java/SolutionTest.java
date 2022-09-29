import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void addString() {
        ArrayList<String> arr = new ArrayList<>();

        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }

        assertEquals("usun", arr.get(0));
    }

    @Test
    void sort() {
        ArrayList<String> arr = new ArrayList<>();

        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(arr);

        assertEquals("[acar, ebed, usun]", arr.toString());
    }
}
