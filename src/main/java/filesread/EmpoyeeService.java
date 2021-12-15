package filesread;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmpoyeeService {
    public static void main(String[] args) {
        Path file = Path.of("employees.txt");
        List<String> content= null;
        try{
            content = Files.readAllLines(file, Charset.forName("ISO-8859-2"));
        }
        catch (IOException e){
            System.out.println("ITT!");
            throw new IllegalStateException("Cant not read file",e);
        }

        System.out.println(content);
        System.out.println(FileSystems.getDefault().getSeparator());
    }
}
