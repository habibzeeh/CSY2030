package com.property.manager.Views;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {


    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void handleCancelButtonAction(ActionEvent event) {
        openSplashScene(event);
    }

    @FXML
    private void handleLoginButtonAction(ActionEvent event) {
        openStaffScene(event);
    }

    private void openSplashScene(Event e){
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Splash.fxml"));
            Stage stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
            stage.setTitle("Property System");
            Scene scene = new Scene(loader.load());
            scene.getStylesheets().add(getClass().getResource("dark-theme.css").toString());
            stage.setScene(scene);
        }catch (IOException io){
            io.printStackTrace();
        }

    }

    private void openStaffScene(Event e){
        try {
            int width = (int) Screen.getPrimary().getBounds().getWidth();
            int height = (int) Screen.getPrimary().getBounds().getHeight();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("StaffHomePage.fxml"));
            Stage stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
            stage.setTitle("Staff Panel");
            Scene scene = new Scene(loader.load(),width,height);
            scene.getStylesheets().add(getClass().getResource("dark-theme.css").toString());
            stage.setScene(scene);
            stage.setMaximized(true);
        }catch (IOException io){
            io.printStackTrace();
        }

    }


}