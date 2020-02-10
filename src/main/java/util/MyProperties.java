package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MyProperties {
    private static MyProperties INSTANCE = null;
    private final Properties properties = new Properties();

    private MyProperties() {
        try {
            String propertyFileName = System.getProperty("environment", "dev");
            properties.load(new FileInputStream(new File("src/main/resources/" + propertyFileName + ".properties")));
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    public static MyProperties getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MyProperties();
        }
        return INSTANCE;
    }

    public Properties getProperties() {
        return properties;
    }

    public String getProperty(String key) {
        return properties.get(key).toString();
    }
}
