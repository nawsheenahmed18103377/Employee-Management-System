package ems.Controllers;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import ems.util.dbconnection;


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
    private ChoiceBox<String> type;
     
    @FXML
    private TextField user_name;

    @FXML
    void handleLoginAction(ActionEvent event) throws IOException, SQLException{
     
        try{
            Connection conn = dbconnection.getConnection();
            String sql = "select * from login where UserName='" + user_name.getText() + "' and Password = '"+ password.getText()+"' and type = '"+ type.getValue()+"'";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            if(rs.next()){
                uname = user_name.getText();
                Parent home_page_parent;
                if("Admin".equals(type.getValue()))
                    home_page_parent = FXMLLoader.load(getClass().getResource("AdminPanel.fxml"));
                else 
                    home_page_parent = FXMLLoader.load(getClass().getResource("EmployeePanel.fxml"));
                Scene home_page_scene = new Scene(home_page_parent);
                Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                app_stage.hide();
                app_stage.setScene(home_page_scene);
                app_stage.show();
            }
        }
        catch (SQLException ex) {
                ex.printStackTrace();
        }
        
    }

    @FXML
    void initialize() {
        assert loginbutton != null : "fx:id=\"loginbutton\" was not injected: check your FXML file 'Login.fxml'.";
        assert password != null : "fx:id=\"password\" was not injected: check your FXML file 'Login.fxml'.";
        assert type != null : "fx:id=\"type\" was not injected: check your FXML file 'Login.fxml'.";
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
        type.getItems().addAll(list);
    }
    

}

