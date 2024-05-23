package com.lordbao.legacyCode.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author Lord_Bao
 * @Date 2024/5/23 20:11
 * @Version 1.0
 */
public class TestProperty {
    private static void testProperty() throws IOException {
        //Store user info into user.properties
        Properties prop = new Properties();
        prop.setProperty("username", "tom");
        prop.setProperty("age", "12");
        String filename = "user.properties";
        FileOutputStream out = new FileOutputStream(filename);

        prop.store(out, "User Info");

        //Load user info from user.properties
        Properties prop2 = new Properties();
        FileInputStream in = new FileInputStream(filename);
        prop2.load(in);
        System.out.println(prop2.getProperty("username"));
        System.out.println(prop2.getProperty("age"));
    }

    private static void testSystemProperty() {
        Properties systemProp = System.getProperties();
        //iterate the systemProp
        systemProp.forEach((k, v) -> {
            System.out.println(k + ":" + v);
        });
        System.out.println("-----------");
        System.out.println(systemProp.getProperty("java.class.path"));
        System.out.println(systemProp.getProperty("user.dir"));
        System.out.println(System.getProperty("java.version"));
    }

    public static void main(String[] args) throws IOException {
//        testProperty();
        testSystemProperty();
    }
}
