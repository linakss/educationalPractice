package educationalpractice.placecarclient.Controller;

import educationalpractice.placecarclient.Entity.Car;
import educationalpractice.placecarclient.Entity.Employee;
import educationalpractice.placecarclient.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static educationalpractice.placecarclient.MainApplication.userAdmin;

public class AdminCars {
    @FXML
    private Button btnAddCar;

    @FXML
    private Button btnCancelCar;

    @FXML
    private Button btnDeleteCar;

    @FXML
    private Button btnEditCar;

    @FXML
    private TableColumn<Car, String> colColorAuto;

    @FXML
    private TableColumn<Employee, String> colFIO;

    @FXML
    private TableColumn<Car, String> colGosNumber;

    @FXML
    private TableColumn<Car, String> colMarkAuto;

    @FXML
    private TableColumn<Car, String> colModelAuto;

    @FXML
    private TableColumn<Employee, String> colNumberPhone;

    @FXML
    private TableView<?> tableCars;
    @FXML
    private Button btnOpenEmployee;
    @FXML
    private Text whoUser;

    @FXML
    private Button btnOpenHome;


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
        MainApplication.showDialog("admin-cars-edit.fxml","Редактирование авто");
    }

    @FXML
    void btnOpenEmployee(ActionEvent event) {
        MainApplication.showDialog("admin-employee.fxml","Сотрудники");
        Stage stage = (Stage) btnOpenEmployee.getScene().getWindow();
        stage.close();
    }

    @FXML
    void btnOpenHome(ActionEvent event) {
        MainApplication.showDialog("admin-main.fxml","Главная");
        Stage stage = (Stage) btnOpenHome.getScene().getWindow();
        stage.close();
    }
    @FXML
    private void initialize() {
        whoUser.setText(userAdmin.getSurname());
        if (userAdmin.getRole().equals("Администратор")) { //роль равна админу или охране
            btnEditCar.setVisible(true);
            btnDeleteCar.setVisible(true);
            btnCancelCar.setVisible(true);
            btnAddCar.setVisible(true);
        } else {
            btnEditCar.setVisible(false);
            btnDeleteCar.setVisible(false);
            btnCancelCar.setVisible(false);
            btnAddCar.setVisible(false);
        }
    }

}
