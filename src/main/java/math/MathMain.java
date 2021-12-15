package math;

import java.util.Random;

public class MathMain {
    public static void main(String[] args) {

        System.out.println(Math.PI);
        System.out.println(new Random().nextInt(100));
        System.out.println(new Random(13).nextInt(100));
    }
}
