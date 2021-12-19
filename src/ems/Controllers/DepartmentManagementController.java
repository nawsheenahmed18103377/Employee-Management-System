package ems.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class DepartmentManagementController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button department_add;

    @FXML
    private Button department_delete;

    @FXML
    private Button department_update;

    @FXML
    private Button department_view_List;

    @FXML
    void HandleBackButtonAction(ActionEvent event) {

    }

    @FXML
    void addDepartmentAction(ActionEvent event) {

    }

    @FXML
    void deleteDepartmentAction(ActionEvent event) {

    }

    @FXML
    void updateDepartmentAction(ActionEvent event) {

    }

    @FXML
    void viewDepartmentListAction(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert department_add != null : "fx:id=\"department_add\" was not injected: check your FXML file 'DepartmentManagement.fxml'.";
        assert department_delete != null : "fx:id=\"department_delete\" was not injected: check your FXML file 'DepartmentManagement.fxml'.";
        assert department_update != null : "fx:id=\"department_update\" was not injected: check your FXML file 'DepartmentManagement.fxml'.";
        assert department_view_List != null : "fx:id=\"department_view_List\" was not injected: check your FXML file 'DepartmentManagement.fxml'.";

    }
}


