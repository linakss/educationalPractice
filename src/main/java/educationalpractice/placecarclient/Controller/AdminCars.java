package educationalpractice.placecarclient.Controller;

import educationalpractice.placecarclient.Entity.AboutHuman;
import educationalpractice.placecarclient.Entity.Car;
import educationalpractice.placecarclient.Entity.Employee;
import educationalpractice.placecarclient.Entity.User;
import educationalpractice.placecarclient.MainApplication;
import educationalpractice.placecarclient.Service.*;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static educationalpractice.placecarclient.MainApplication.userAdmin;

public class AdminCars {
    AboutHumanServ serv = new AboutHumanServ();
    ErrorAlertServ alertServ = new ErrorAlertServ();
    @FXML
    private Button btnAddCar;

    @FXML
    private Button btnCancelCar;

    @FXML
    private Button btnDeleteCar;

    @FXML
    private Button btnEditCar;

    @FXML
    private TableColumn<AboutHuman,String> colColorAuto;

    @FXML
    private TableColumn<Employee, String> colFIO;

    @FXML
    private TableColumn<AboutHuman,String> colGosNumber;

    @FXML
    private TableColumn<AboutHuman,String> colMarkAuto;

    @FXML
    private TableColumn<AboutHuman,String> colModelAuto;

    @FXML
    private TableColumn<AboutHuman, String> colNumberPhone;

    @FXML
    private TableView<AboutHuman> tableCars;
    @FXML
    private Button btnOpenEmployee;
    @FXML
    private Text whoUser;
    @FXML
    private Button btnOpenHome;
    private boolean addFlag = true;

    @FXML
    void onMouseClickDataList(MouseEvent event) {
        if (event.getButton().equals(MouseButton.PRIMARY)){
            if (event.getClickCount() == 2){
                addFlag = false;
                AboutHuman temp = getSelectionElement();
            }
        }
    }

    private AboutHuman getSelectionElement() {
        AboutHuman temp = tableCars.getSelectionModel().getSelectedItem();
        return temp;
    }

    @FXML
    void btnAddCar(ActionEvent event) {
        MainApplication.showDialog("admin-cars-edit.fxml","Добавить машину в базу");
    }

    @FXML
    void btnCancelCar(ActionEvent event) {
        tableCars.editableProperty().setValue(false);
    }

    @FXML
    void btnDeleteCar(ActionEvent event) {
        try {serv.delete(getSelectionElement());
        }catch (Exception e){
            alertServ.deleteVoid(e);
        }


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
        whoUser.setText(userAdmin.getSurname()+"\n"+userAdmin.getName()+"\n"+userAdmin.getSurname());
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

        serv.getAll();

        //связываем поля таблицы со столбцами
        colFIO.setCellValueFactory(new PropertyValueFactory<>("employeeName"));
        colColorAuto.setCellValueFactory(new PropertyValueFactory<>("carColor"));
        colModelAuto.setCellValueFactory(new PropertyValueFactory<>("carModel"));
        colMarkAuto.setCellValueFactory(new PropertyValueFactory<>("carMark"));
        colGosNumber.setCellValueFactory(new PropertyValueFactory<>("carGosNumber"));
        colNumberPhone.setCellValueFactory(new PropertyValueFactory<>("employeeNumberPhone"));
        tableCars.setItems(serv.getData());
    }
}
