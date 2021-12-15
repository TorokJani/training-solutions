package arraylistbejaras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoopTypesModifyMain
{
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Jack", "Jani", "John"));
        for (int i = 0; i < names.size(); i++) {
            names.set(i, "dr. " + names.get(i));
        }
        System.out.println(names);

        for (String name:names){
            if (name.equals("dr. Jani")){
                names.remove("dr. Jani");
            }
        }
        System.out.println(names);
    }
}
