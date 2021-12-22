package properties;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.Properties;

import static org.junit.Assert.assertEquals;

public class PropertiesTest {
    @Test
    public void testProperties(){
        Properties p = new Properties();
        p.setProperty("host","training360.com");

        assertEquals(p.getProperty("host"),"training360.com");
        System.out.println(p);

        String s = p.getProperty("port","80");
        assertEquals(p.getProperty("port","80"), "80");


    }

    @Test
    public void testLoad(){
        Properties p = new Properties();
        try(InputStream is = PropertiesTest.class.getResourceAsStream("/welcome.properties")){
            p.load(is);

        }
        catch (IOException ioe){
            throw new IllegalStateException("Cannot load file",ioe);
        }

        String value = p.getProperty("welcome.message");
        System.out.println(value);
    }

    @Test
    public void testSave(){
        Properties properties = new Properties();
        properties.setProperty("host","training360.com");
        properties.setProperty("port","80");

        try (Writer writer = new FileWriter("config.properties")) {
            properties.store(writer,null);
        }
        catch (IOException ioe){
            throw new IllegalStateException("Can't write it in the properties file",ioe);
        }
    }
}
