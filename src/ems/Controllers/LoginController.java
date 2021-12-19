package ems.Controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import util.dbconnection;

public class LoginController implements Initializable{
    private static void showAlert(String login_Successful) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    ObservableList list = FXCollections.observableArrayList();
     public static String uname = null;
     
     
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button loginbutton;

    @FXML
    private PasswordField password;

    @FXML
    private TextField user_name;

    @FXML
    void handleLoginAction(ActionEvent event) throws IOException{
     
        try{
            Connection conn = dbconnection.getConnection();
            
        }
        catch (SQLException ex) {
                ex.printStackTrace();
        }
    }

    @FXML
    void initialize() {
        assert loginbutton != null : "fx:id=\"loginbutton\" was not injected: check your FXML file 'Login.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'Login.fxml'.";
        assert user_name != null : "fx:id=\"user_name\" was not injected: check your FXML file 'Login.fxml'.";

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
     loadData();
    }

    private void loadData() {
       list.removeAll(list);
        String a="Admin";
        String b="Employee";
        list.addAll(a, b);
        Type.getItems().addAll(list);
    }
    

}

