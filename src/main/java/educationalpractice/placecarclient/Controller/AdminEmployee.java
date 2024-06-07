package educationalpractice.placecarclient.Controller;

import educationalpractice.placecarclient.Entity.Car;
import educationalpractice.placecarclient.Entity.Employee;
import educationalpractice.placecarclient.MainApplication;
import educationalpractice.placecarclient.Service.EmployeeServ;
import educationalpractice.placecarclient.Service.ErrorAlertServ;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import static educationalpractice.placecarclient.MainApplication.userAdmin;
import static educationalpractice.placecarclient.MainApplication.userInf;

public class AdminEmployee {
    private final EmployeeServ service = new EmployeeServ();
    private final ErrorAlertServ alertService = new ErrorAlertServ();
    private boolean addFlag = true;
    private Employee getSelectionElement() {
        Employee temp = tableEmployee.getSelectionModel().getSelectedItem();
        return temp;
    }
    @FXML
    private TableView<Employee> tableEmployee;
    @FXML
    private TableColumn<Employee,String> colFIO;
    @FXML
    private TableColumn<Car,String> colGosNumber;

    @FXML
    private TableColumn<Employee,String> colLogin;

    @FXML
    private TableColumn<Employee,String> colNumberPhone;

    @FXML
    private TableColumn<Employee,String> colPassword;

    @FXML
    private TableColumn<Employee,String> colRole;

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

    @FXML
    private void initialize(){
        //получаем список с сервера
        service.getAll();
//        tableEmployee.setItems(service.getData());
        if (userInf.whoRole(userInf)) { //роль равна админу или охране
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

        //System.out.println("Установленный: "+userAdmin.getLogin()+" "+userAdmin.getPassword());

        System.out.println("Введенный: "+userInf.getLogin()+" "+userInf.getPassword());


        //связываем поля таблицы со столбцами
        colFIO.setCellValueFactory(new PropertyValueFactory<Employee, String>("fio"));
        colRole.setCellValueFactory(new PropertyValueFactory<Employee, String>("role"));
        colNumberPhone.setCellValueFactory(new PropertyValueFactory<Employee, String>("numberPhone"));
        colLogin.setCellValueFactory(new PropertyValueFactory<Employee, String>("login"));
        colPassword.setCellValueFactory(new PropertyValueFactory<Employee, String>("password"));
        colGosNumber.setCellValueFactory(new PropertyValueFactory<Car, String>("gosNumberCar"));
        tableEmployee.setItems(service.getData());
    }

}
