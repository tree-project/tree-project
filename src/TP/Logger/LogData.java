package TP.Logger;

import TP.Resources;

import java.util.List;

public class LogData {
    private List<String> allLogs;

    public static List<String> getLogs(String adminKey) {
        if (adminKey.equals(Resources.adminPassword)) {

        } else {

        }
        LogManager lm = new LogManager(Resources.currentUsername, Resources.loginDate);
        lm.addData(new LogReason.DENIED_ACCESS(), "URGENT", "Unauthorized log pull request");

        return null;
    }
}
