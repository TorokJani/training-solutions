package collectionsiterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    @Test
    public void testRemove(){
      List<Integer> l = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
      /*for (int i:l){
          if (i%2==0){
              l.remove(Integer.valueOf(i));
          }
      }*/

        Iterator<Integer> i =l.iterator();
        while (i.hasNext()){
            int j = i.next();
            if (j%2==0){
                i.remove();
            }
        }
        System.out.println(l);
    }
}
