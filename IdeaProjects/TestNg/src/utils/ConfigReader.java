package utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    static Properties prop;
    public static Properties readProperties(String filePath){
        try {
            FileOutputStream fis=new FileOutputStream(filePath);
            Properties prop=new Properties();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        return prop;
    }
    public static String getPropertiesvalue(String key){
        return prop.getProperty(key);
    }
}
