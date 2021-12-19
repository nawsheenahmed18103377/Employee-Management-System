package ems.Controllers;



import static ems.Controllers.LoginController.uname;
import ems.util.dbconnection;
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
import javafx.stage.Stage;

public class AdminPanelController implements Initializable{
    

    ObservableList list = FXCollections.observableArrayList();
//     public static String uname = null;
     
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button att_management;

    @FXML
    private Button dept_management;

    @FXML
    private Button des_management;

    @FXML
    private Button emp_management;

    @FXML
    private Button leave_management;

    @FXML
    private Button sal_management;

    @FXML
    void attendance_manAction(ActionEvent event) throws IOException {
        
        Parent home_page_parent;
        home_page_parent = FXMLLoader.load(getClass().getResource("AttendanceManagement.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }

    @FXML
    void dep_manAction(ActionEvent event) throws IOException {
        Parent home_page_parent;
        home_page_parent = FXMLLoader.load(getClass().getResource("DepartmentManagement.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(home_page_scene);
        app_stage.show();

    }

    @FXML
    void des_manAction(ActionEvent event) throws IOException {
        Parent home_page_parent;
        home_page_parent = FXMLLoader.load(getClass().getResource("DesignationManagement.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(home_page_scene);
        app_stage.show();

    }

    @FXML
    void emp_manAction(ActionEvent event) throws IOException {
        Parent home_page_parent;
        home_page_parent = FXMLLoader.load(getClass().getResource("EmployeeManagement.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(home_page_scene);
        app_stage.show();

    }

    @FXML
    void leave_manAction(ActionEvent event) throws IOException {
        Parent home_page_parent;
        home_page_parent = FXMLLoader.load(getClass().getResource("LeaveManagement.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(home_page_scene);
        app_stage.show();

    }

    @FXML
    void salary_manAction(ActionEvent event) throws IOException {
        Parent home_page_parent;
        home_page_parent = FXMLLoader.load(getClass().getResource("SalaryManagement.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage.hide();
        app_stage.setScene(home_page_scene);
        app_stage.show();

    }

    @FXML
    void initialize() {
        assert att_management != null : "fx:id=\"att_management\" was not injected: check your FXML file 'AdminPanel.fxml'.";
        assert dept_management != null : "fx:id=\"dept_management\" was not injected: check your FXML file 'AdminPanel.fxml'.";
        assert des_management != null : "fx:id=\"des_management\" was not injected: check your FXML file 'AdminPanel.fxml'.";
        assert emp_management != null : "fx:id=\"emp_management\" was not injected: check your FXML file 'AdminPanel.fxml'.";
        assert leave_management != null : "fx:id=\"leave_management\" was not injected: check your FXML file 'AdminPanel.fxml'.";
        assert sal_management != null : "fx:id=\"sal_management\" was not injected: check your FXML file 'AdminPanel.fxml'.";

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}




