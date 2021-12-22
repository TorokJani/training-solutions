package collectionsmap;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class MapTest {
    @Test
    public void testMap(){
        Map<String,String> codes = new HashMap<>();
        System.out.println(codes.isEmpty());

        codes.put("200","OK");
        codes.put("404","Not found");
        System.out.println(codes);

        Map<String,String> expected = new HashMap<>();
        expected.put("200","OK");
        expected.put("404","Not found");
        assertEquals(codes,expected);

        String s = codes.get("200");
        System.out.println(s);

        expected.put("304","Not Modified");
        System.out.println(expected);
    }


        @Test
        public void testMap2() {
            Map<String, String> codes = new LinkedHashMap<>();
            System.out.println(codes.isEmpty());

            codes.put("200", "OK");
            codes.put("404", "Not found");
            System.out.println(codes);

            Map<String, String> expected = new LinkedHashMap<>();
            expected.put("200", "OK");
            expected.put("404", "Not found");
            assertEquals(codes, expected);

            String s = codes.get("200");
            System.out.println(s);

            expected.put("304", "Not Modified");
            System.out.println(expected);

            for (Map.Entry entries :codes.entrySet()){
                System.out.println(entries.getKey());
                System.out.println(entries.getValue());
            }
        }

        @Test
    public  void testTrainersMap(){
        List<Trainer> trainers = Arrays.asList(
                new Trainer(1L,"John"),
                new Trainer(2L,"Jack"),
                new Trainer(3L, "Jane"),
                new Trainer(4L, "Joe")
        );

        Map<Long, Trainer> m = new HashMap<>();
            for (Trainer t : trainers) {
                m.put(t.getId(),t);
            }


        Trainer t= m.get(3L);
            System.out.println(t.getName());
        }
    }
