package educationalpractice.placecarclient.Controller;

import educationalpractice.placecarclient.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class AdminEmployee {

    @FXML
    private TableView<?> tableEmployee;

    @FXML
    private Text whoUser;

    @FXML
    void btnAddEmployee(ActionEvent event) {

    }

    @FXML
    void btnCancelEmployee(ActionEvent event) {

    }

    @FXML
    void btnDeleteEmployee(ActionEvent event) {

    }

    @FXML
    void btnEditEmployee(ActionEvent event) {
        MainApplication.showDialog("admin-employee-edit.fxml","Автостоянка 'PlaceCar'");
    }

    @FXML
    void btnOpenCars(ActionEvent event) {

    }

    @FXML
    void btnOpenHome(ActionEvent event) {

    }

}
