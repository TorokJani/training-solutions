package collectionsccomp;

import org.junit.Test;

import java.text.Collator;
import java.util.*;

public class TrainersTest
{
    @Test
    public void testSort(){
        List<String> names =  Arrays.asList("Joe","Jack","Jane");
        Collections.sort(names);

        System.out.println(names);
    }

    @Test
    public void testSortWithAccutes(){
        List<String > names = Arrays.asList("Joe","Jack","Jane","Ábel","éva","jack");
        Collections.sort(names, Collator.getInstance(new Locale("hu","HU")));
        System.out.println(names);

    }

    @Test
    public void testTrainersSort(){
        List<Trainer> trainers = Arrays.asList(
                new Trainer("joe", 1),
                new Trainer("Jack",2),
                new Trainer("Jane",3),
                new Trainer("J",4),
                new Trainer("Ábel",5),
                new Trainer("éva",6)
        );

        Collections.sort(trainers);
        System.out.println(trainers);

        Collections.sort(trainers,new SalaryComparator());
        System.out.println(trainers);

        Collections.sort(trainers, new Comparator<Trainer>() {
            @Override
            public int compare(Trainer o1, Trainer o2) {
                return o1.salary -o2.salary;
            }
        });

        System.out.println(trainers);

        Collections.sort(trainers, new Comparator<Trainer>() {
            @Override
            public int compare(Trainer o1, Trainer o2) {
                return o1.name.length()-o2.name.length();            }
        });

        System.out.println(trainers);


    }

    public class SalaryComparator implements Comparator<Trainer>{
        @Override
        public int compare(Trainer o1, Trainer o2) {
            return o1.salary -o2.salary;
        }



    }


}
