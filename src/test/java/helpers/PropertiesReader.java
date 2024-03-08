package helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
    private static final String PROPERTIES_FILE_PATH="src/tests/resources/resources.properties";
    public static String getPropery(String key){
        Properties properties=new Properties();
        try
            ( FileInputStream fis=new FileInputStream(PROPERTIES_FILE_PATH)){
               properties.load(fis);
               return properties.getProperty(key);
            }catch (IOException exception){
            return null;
        }



    }
}
