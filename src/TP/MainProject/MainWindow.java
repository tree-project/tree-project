package TP.MainProject;

import TP.Logger.LogManager;

import java.util.Date;

public class MainWindow {
    public static void StartWindow(String username) {
        //TODO hub of all features
        LogManager currentUser = new LogManager(username, new Date());
    }
}
