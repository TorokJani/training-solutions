package chars;

import java.util.ArrayList;
import java.util.Arrays;

public class CharMain {
    public static void main(String[] args) {
        char c= 'a';
        System.out.println((int)c);
        System.out.println((char) (c+1));

        if ('0' <= c && c <'9'){
            System.out.println("szamjegy");
        }
        if ('a' <= c && c <='z'){
            System.out.println("kisbetu");
        }

        String welcome = "Hello";
        System.out.println(welcome.charAt(0));
        char[] letters = welcome.toCharArray();

        System.out.println(Arrays.toString(letters));

        for (char d: letters){
            System.out.println(d);
        }

        char[] word = {'h','e','l'};
        String message = new String(word);
        System.out.println(message);


    }
}
