package ems.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class EmployeePanelController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button emp_attendance;

    @FXML
    private Button emp_leave;

    @FXML
    private Button emp_profile;

    @FXML
    private Button emp_salary;

    @FXML
    void attendanceAction(ActionEvent event) {

    }

    @FXML
    void leaveAction(ActionEvent event) {

    }

    @FXML
    void profileAction(ActionEvent event) {

    }

    @FXML
    void salaryAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert emp_attendance != null : "fx:id=\"emp_attendance\" was not injected: check your FXML file 'EmployeePanel.fxml'.";
        assert emp_leave != null : "fx:id=\"emp_leave\" was not injected: check your FXML file 'EmployeePanel.fxml'.";
        assert emp_profile != null : "fx:id=\"emp_profile\" was not injected: check your FXML file 'EmployeePanel.fxml'.";
        assert emp_salary != null : "fx:id=\"emp_salary\" was not injected: check your FXML file 'EmployeePanel.fxml'.";

    }

}



