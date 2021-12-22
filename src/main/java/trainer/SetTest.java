package trainer;

import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest {
/*
    @Test
    public void testSet(){

        Set<Trainer> s = new HashSet<>();
        Collection<Trainer> c =s;

        s.add(new Trainer("Jack",2000));
        s.add(new Trainer("Joe",2000));
        s.add(new Trainer("Jack",2000));

        System.out.println(s);
    }
*/
    @Test
    public void testSetOrder(){

        Set<Trainer> s = new LinkedHashSet<>();
        Collection<Trainer> c =s;

        s.add(new Trainer("Jack",1998));
        s.add(new Trainer("Jane",1999));
        s.add(new Trainer("Jani",1000));

        System.out.println(s);
    }
}
