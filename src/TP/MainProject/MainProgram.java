package TP.MainProject;

import TP.Logger.LogManager;
import TP.Resources;

import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class MainProgram {
    //TODO everything T_T
    static JFrame mainWindow = new JFrame("Tree Preview v0.1");
    static Dimension mainWindowSize = new Dimension(700, 500);
    public static void openDataViewer(String key, LogManager worker) {

    }

    public static void create(String key, LogManager worker) {
        mainWindow.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        mainWindow.setSize(mainWindowSize);
        JLabel listViewer = new JLabel();
        for (int i = 0; i < Resources.trees.length; i++) {
            listViewer.setText(listViewer.getText() + "\nTree " + i + ": " + Resources.trees[i].lastWatered + ", " + Resources.trees[i].lastFertilized + ", " + Resources.trees[i].growth);
        }
        mainWindow.getContentPane().add(listViewer, BorderLayout.CENTER);
        mainWindow.setVisible(true);
    }

    public static void main(String[] args) {
        create("1", new LogManager("reap", new Date()));
    }

}
