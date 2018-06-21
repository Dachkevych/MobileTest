package com.epam.lab.utils;

public class Constants {

    private static ConfigFileReader fileReader = new ConfigFileReader();

    public final static String  GOOGLE_NEXUS_5 = "Google Nexus 5 - 5.0.0 - API 21 - 1080x1920";
    public final static String  ANDROID = "Android";
    public final static String  VERSION_5_0 = "5.0";
    public final static String  APPLICATIONS_NAME = "selendroid-test-app-0.17.0.apk";
    public final static String  CHROME = "chrome";

    //Properties
    public final static String  PROPERTIES_PATH = "src/main/resources/config.properties";
    public final static String  USER_XML_PATH = fileReader.getProperty("userXMLPath");
    public final static String  APPS_PATH = fileReader.getProperty("appsPath");
}
