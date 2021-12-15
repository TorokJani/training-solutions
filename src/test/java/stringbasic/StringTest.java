package stringbasic;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class StringTest {
   @Test
   public void testEquals(){
        String s = "John Doe";
        String t = s.toUpperCase();
        System.out.println(s.toUpperCase());
        System.out.println(t);

       String u = new String("alma").intern();
       String v = new String("alma").intern();

    }
}
