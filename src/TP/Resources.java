package TP;

import java.io.File;
import java.util.Date;

public class Resources {

    public static Config configFile = new Config("placeholder");
    public static String currentUsername;
    public static String password = configFile.getProperty("password");
    public static File TreeFile = new File(configFile.getProperty("treeFilePath"));
    public static Tree[] trees = Tree.initTreesScan(TreeFile.getPath(), 0);
    public static Date loginDate;
    public static String adminPassword = configFile.getProperty("adminPassword");
    //TODO organize + get most possible resources
}