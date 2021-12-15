import java.time.LocalDate;
import java.util.Locale;

public class PrintfMain {
    public static void main(String[] args) {
        System.out.printf("The result is: %d",400);
        System.out.printf("8%.2f",10000.0 / 3.0);
        System.out.println();
        System.out.printf("%s", LocalDate.now().toString());
        String s = String.format("Hello%s"," Jani");
        System.out.println(s);
    }
}
