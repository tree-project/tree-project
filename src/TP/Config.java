package TP;

import java.util.Properties;

public class Config {
    Properties configFile;
    public Config(String path) {
        configFile = new java.util.Properties();

        try {
            configFile.load(this.getClass().getResourceAsStream(path));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return this.configFile.getProperty(key);
    }
}
