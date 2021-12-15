package stringbuilder;

public class StringBuilderMain {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(12);

        sb.append("plusz");
        String s = sb.toString();
        System.out.println(s);
        sb.insert(2,"adfs");
        s = sb.toString();
        System.out.println(s);
    }
}
