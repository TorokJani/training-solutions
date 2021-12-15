package stringscanner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringScannerMain
{
    public static void main(String[] args) {
        Scanner s = new Scanner("aaa,bbb,ccc,ddd").useDelimiter(",");
        List<String> l = new ArrayList<>();
        while (s.hasNext()) {
            String t = s.next();
            System.out.println(t);
            l.add(t);

        }
        System.out.println(Arrays.toString(l.toArray()));
    }

}
