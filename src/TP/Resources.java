package TP;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Resources {

    public static String currentUsername;
    public static String password = "treeproject2020";

    public static File TreeFile = new File("placeholder");
    public static Scanner FileScanner;

    static {
        try {
            FileScanner = new Scanner(TreeFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    } // initialize FileScanner

    public static String[] fileContent;
    public static String[][] fileContentSplit;

    public static Tree[] trees;

    public static void initTreesScan() {
        int i = 0;
        while (FileScanner.hasNext()) {
            fileContent[i] = FileScanner.next();
            for(int j = 0; j < 100; j++) {
                fileContentSplit[i][j] = String.valueOf(fileContent[i].split(","));
            }

            i++;
        }

        for (int in = 0; in < fileContentSplit.length; in++) {
            for (int ind = 0; ind < fileContentSplit[i].length; ind++) {
                Tree tempTree = new Tree(fileContentSplit[in][ind], fileContentSplit[in][ind+1], fileContentSplit[in][ind+2]);
                trees[in] = tempTree;
            }
        }
    }
    //TODO organize + get most possible resources
}