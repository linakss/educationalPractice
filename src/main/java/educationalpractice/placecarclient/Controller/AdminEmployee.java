package educationalpractice.placecarclient.Controller;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

import educationalpractice.placecarclient.Entity.AboutHuman;
import educationalpractice.placecarclient.Entity.Car;
import educationalpractice.placecarclient.Entity.Employee;
import educationalpractice.placecarclient.MainApplication;
import educationalpractice.placecarclient.Response.DataResp;
import educationalpractice.placecarclient.Service.*;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import lombok.Getter;

import java.io.IOException;

import static educationalpractice.placecarclient.MainApplication.userAdmin;
import static educationalpractice.placecarclient.MainApplication.userInf;

public class AdminEmployee {
    private final AboutHumanServ service = new AboutHumanServ();
    private final ErrorAlertServ alertService = new ErrorAlertServ();
    @Getter
    private ObservableList<AboutHuman> data = FXCollections.observableArrayList();

    private boolean addFlag = true;
    private AboutHuman getSelectionElement() {
        AboutHuman temp = tableAboutHuman.getSelectionModel().getSelectedItem();
        return temp;
    }
    @FXML
    private TableView<AboutHuman> tableAboutHuman;
    @FXML
    private TableColumn<AboutHuman,String> colFIO;

    @FXML
    private TableColumn<AboutHuman,String> colLogin;

    @FXML
    private TableColumn<AboutHuman,String> colNumberPhone;

    @FXML
    private TableColumn<AboutHuman,String> colPassword;

    @FXML
    private TableColumn<AboutHuman,String> colRole;
    @FXML
    private TableColumn<AboutHuman,String> colGosNumber;

    @FXML
    private Text whoUser;
    @FXML
    private Button btnAddEmployee;

    @FXML
    private Button btnCancelEmployee;

    @FXML
    private Button btnDeleteEmployee;

    @FXML
    private Button btnEditEmployee;

    @FXML
    private Button btnOpenCars;

    @FXML
    private Button btnOpenHome;
    @FXML
    void btnAddEmployee(ActionEvent event) {
        MainApplication.showDialog("admin-employee-edit.fxml","Добавление пользователя в базу");

    }

    @FXML
    void btnCancelEmployee(ActionEvent event) {

    }

    @FXML
    void btnDeleteEmployee(ActionEvent event) {

    }

    @FXML
    void btnEditEmployee(ActionEvent event) {
        MainApplication.showDialog("admin-employee-edit.fxml","Редактирование пользователя");
    }

    @FXML
    void btnOpenCars(ActionEvent event) {
        MainApplication.showDialog("admin-cars.fxml","Автостоянка 'PlaceCar'");
        Stage stage = (Stage) btnOpenCars.getScene().getWindow();
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
        service.getAll();
        ObservableList<AboutHuman> data = FXCollections.observableArrayList(service.getCombinedData());
        whoUser.setText(userAdmin.getSurname()+"\n"+userAdmin.getName()+"\n"+userAdmin.getSurname());
//        tableEmployee.setItems(service.getData());
        if (userAdmin.getRole().equals("Администратор") ) { //роль равна админу или охране
            btnAddEmployee.setVisible(true);
            btnEditEmployee.setVisible(true);
            btnDeleteEmployee.setVisible(true);
            btnCancelEmployee.setVisible(true);
        } else {
            btnAddEmployee.setVisible(false);
            btnEditEmployee.setVisible(false);
            btnDeleteEmployee.setVisible(false);
            btnCancelEmployee.setVisible(false);
        }
        System.out.println("Введенный: "+userInf.getLogin()+" "+userInf.getPassword());
        //связываем поля таблицы со столбцами
        colFIO.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
        colRole.setCellValueFactory(new PropertyValueFactory<>("employeeRole"));
        colNumberPhone.setCellValueFactory(new PropertyValueFactory<>("employeeNumberPhone"));
        colLogin.setCellValueFactory(new PropertyValueFactory<>("employeeLogin"));
        colPassword.setCellValueFactory(new PropertyValueFactory<>("employeePassword"));
        colGosNumber.setCellValueFactory(new PropertyValueFactory<>("carGosNumber"));
        tableAboutHuman.setItems(service.getData());

    }

}