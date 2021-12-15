package fileswrite;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class EmployeesService
{
    public static void main(String[] args) {
        Path file= Path.of("employees2.txt");
        try {
            Files.write(file, List.of("Jow Doe","Jan Doe"));
        } catch (IOException e) {
            throw new IllegalStateException("Can not write file",e);
        }
    }
}
