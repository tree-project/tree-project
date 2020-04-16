package TP.MainProject;

import TP.Resources;
import TP.Tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* public class DataListSaver {
    //TODO searcher and viewer
    static Tree[] trees = Resources.trees;
    static File file = new File("C:\\Users\\Sharfi\\Documents\\TreeProject\\TreeData.txt");
    static FileOutputStream fos;

    static {
        try {
            fos = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    } // initialize fos

    public static void initSave(String toWrite) throws IOException {
        if (!file.exists()) {
            file.createNewFile();
        }

        char[] toWriteEncoding = new char[toWrite.length()];
        byte[] toWriteEncoded = new byte[toWrite.length()];
        for (int i = 0; i < toWrite.length() ; i++) {
            toWriteEncoding[i] = toWrite.charAt(i);
            toWriteEncoded[i] = (byte)toWriteEncoding[i];
        }

        fos.write(toWriteEncoded);
    }
}

 */