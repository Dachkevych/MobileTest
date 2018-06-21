package com.epam.lab.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import static com.epam.lab.utils.Constants.PROPERTIES_PATH;

public class ConfigFileReader {

    private Properties properties;

    public ConfigFileReader() {
        try (BufferedReader reader = new BufferedReader(new FileReader(PROPERTIES_PATH))) {
            properties = new Properties();
            properties.load(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(String.format("Configuration.properties not found at %s", PROPERTIES_PATH));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String key) {
        String property = properties.getProperty(key);
        if (property != null) return property;
        else throw new RuntimeException(String.format("%s not specified in the Configuration.properties file.", key));
    }
}
