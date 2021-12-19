package ems.Controllers;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AdminPanelController {
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
    void attendance_manAction(ActionEvent event) {

    }

    @FXML
    void dep_manAction(ActionEvent event) {

    }

    @FXML
    void des_manAction(ActionEvent event) {

    }

    @FXML
    void emp_manAction(ActionEvent event) {

    }

    @FXML
    void leave_manAction(ActionEvent event) {

    }

    @FXML
    void salary_manAction(ActionEvent event) {

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

}




