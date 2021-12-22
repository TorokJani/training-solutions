package trainer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListTest {
    @Test
    public void testList(){
        List<String> l = new ArrayList<>();
        l.add("John");
        l.add("Jack");
        System.out.println(l);
        assertEquals(l, Arrays.asList("John","Jack"));

        Collection<String> c =l;
        c.add("Jane");
        System.out.println(c);
        System.out.println(c.size());

        assertEquals(c, Arrays.asList("John","Jack","Jane"));
        c.clear();
        assertEquals(c.isEmpty(),true);
    }
}
