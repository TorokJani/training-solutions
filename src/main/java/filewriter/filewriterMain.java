package filewriter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class filewriterMain
{
    public static void main(String[] args) {
        List<String> employees = Arrays.asList("Jane Doe","Jani Dow", "Jack Dow");
        Path file = Path.of("employees4.txt");
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(file))) {
            for (String e :employees){
                  writer.print(e);
                  writer.print(",");
                  writer.println(200_000);


            }
        }
        catch (IOException ioe){
            throw new IllegalStateException("Can't write to the file",ioe);
        }
    }
}
