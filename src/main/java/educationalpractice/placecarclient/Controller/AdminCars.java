package educationalpractice.placecarclient.Controller;

import educationalpractice.placecarclient.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

public class AdminCars {

    @FXML
    private TableView<?> tableCars;

    @FXML
    void btnAddCar(ActionEvent event) {
        MainApplication.showDialog("admin-cars-edit.fxml","Добавить машину в базу");
    }

    @FXML
    void btnCancelCar(ActionEvent event) {

    }

    @FXML
    void btnDeleteCar(ActionEvent event) {

    }

    @FXML
    void btnEditCar(ActionEvent event) {

    }

    @FXML
    void btnOpenEmployee(ActionEvent event) {
        MainApplication.showDialog("admin-employee.fxml","Сотрудники");
    }

    @FXML
    void btnOpenHome(ActionEvent event) {
        MainApplication.showDialog("admin-main.fxml","Главная");
    }

}
