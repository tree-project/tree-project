package TP;

import java.util.Date;

public class Resources {

    public static Config configFile = new Config("C:\\Users\\Sharfi\\IdeaProjects\\TreeProject\\src\\TP\\generalSettings.cfg");
    public static String currentUsername;
    public static String password = configFile.getProperty("password");
    public static Tree[] trees = Tree.initTreesScan(configFile.getProperty("treeFilePath"), 0);
    public static Date loginDate;
    public static String adminPassword = configFile.getProperty("adminPassword");
    //TODO organize + get most possible resources
}