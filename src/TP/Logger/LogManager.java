package TP.Logger;

import TP.Resources;

import java.util.Date;

public class LogManager {
    Date loginDate;
    String workerName;

    public void addData(LogReason reason, String name, String log) {

    }

    public void callUpdate() {

    }

    public void forceUpdate(String adminKey) {

    }

    public void removeData(String adminKey, String name) {

    }

    public Date getLoginDate() {
        return loginDate;
    }

    public String getWorkerName() {
        return workerName;
    }

    public LogManager(String workerName, Date loggedAt) {
        this.loginDate = loggedAt;
        this.workerName = workerName;
        Resources.loginDate = loggedAt;
    }
}
