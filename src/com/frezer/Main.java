package com.frezer;

import javafx.application.Application;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {
    @Override

    public void start(Stage primaryStage) {

        double deg = 47;

        JOptionPane.showMessageDialog(null, deg + " degrees is " + Math.toRadians(deg) + " radians.");

        double A = Math.toRadians(deg);

        JOptionPane.showMessageDialog(null, deg + " A is an available of " + A );



    }
}
