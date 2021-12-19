package ems.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class EmployeeManagementController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button emp_add;

    @FXML
    private Button emp_delete;

    @FXML
    private Button emp_update;

    @FXML
    private Button emp_view_List;

    @FXML
    void HandleBackButtonAction(ActionEvent event) {

    }

    @FXML
    void addEmpAction(ActionEvent event) {

    }

    @FXML
    void deleteEmpAction(ActionEvent event) {

    }

    @FXML
    void updateEmpAction(ActionEvent event) {

    }

    @FXML
    void viewEmpListAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert emp_add != null : "fx:id=\"emp_add\" was not injected: check your FXML file 'EmployeeManagement.fxml'.";
        assert emp_delete != null : "fx:id=\"emp_delete\" was not injected: check your FXML file 'EmployeeManagement.fxml'.";
        assert emp_update != null : "fx:id=\"emp_update\" was not injected: check your FXML file 'EmployeeManagement.fxml'.";
        assert emp_view_List != null : "fx:id=\"emp_view_List\" was not injected: check your FXML file 'EmployeeManagement.fxml'.";

    }

}


