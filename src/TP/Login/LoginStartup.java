package TP.Login;

import TP.MainProject.MainWindow;
import TP.Resources;
import org.jetbrains.annotations.NotNull;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class LoginStartup {
    private static JButton loginBtn = new JButton("LOGIN");
    private static JFrame loginFrame = new JFrame("Login Tab");
    private static JTextField usernameField = new JTextField();
    private static JTextField passwordField = new JTextField();

    private static String username;
    private static String password;

    /* -------------------------------------- */
    public static void startLogin() {
        loginFrame.setSize(700, 500);
        loginFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        loginBtn.setPreferredSize(new Dimension(150, 50));
        loginBtn.setAction(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                username = usernameField.getText();
                password = passwordField.getText();
                verifyLogin(password);
            }
        });
        loginBtn.setEnabled(true);

        usernameField.setPreferredSize(new Dimension(150, 50));
        passwordField.setPreferredSize(new Dimension(150, 50));

        loginFrame.getContentPane().add(usernameField, BorderLayout.PAGE_START);
        loginFrame.getContentPane().add(passwordField, BorderLayout.CENTER);
        loginFrame.getContentPane().add(loginBtn, BorderLayout.PAGE_END);

        loginFrame.setVisible(true);
    }
    /* -------------------------------------- */
    private static void verifyLogin(@NotNull String inField) {
        if (inField.equals(Resources.password) && username != null) {
            Resources.currentUsername = username;
            loginFrame.dispose();
            MainWindow.StartWindow(username);
        }
    }
} //TODO DON'T RUIN THIS
