package com.home.factorymethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class Props {

    private static Properties props;

    static {
        props = new Properties();

        try (InputStream in = new FileInputStream(Paths.get("").toAbsolutePath().toString() + "/src/com/home/factorymethod/config.properties")) {

            System.out.println("Path: " + Paths.get("").toAbsolutePath().toString());
            props.load(in);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getString(String property) {
        return props.getProperty(property);
    }

    public static int getInt(String property, int defaultValue) {
        String value = getString(property);

        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }
}