package educationalpractice.placecarclient.Controller;

import educationalpractice.placecarclient.Entity.Car;
import educationalpractice.placecarclient.Entity.Employee;
import educationalpractice.placecarclient.MainApplication;
import educationalpractice.placecarclient.Service.EmployeeServ;
import educationalpractice.placecarclient.Service.ErrorAlertServ;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class AdminEmployeeEdit {
    private final EmployeeServ service = new EmployeeServ();
    private final ErrorAlertServ alertService = new ErrorAlertServ();
    private boolean addFlag = true;
    private Employee getSelectionElement() {
        Employee temp = dataCarsList.getSelectionModel().getSelectedItem();
        return temp;
    }
    @FXML
    private ListView<Employee> dataCarsList;

    @FXML
    private void initialize(){
        service.getAll();
        dataCarsList.setItems(service.getData());
    }
    @FXML
    private ComboBox<Car> comboCarProfile;

    @FXML
    private ComboBox<?> comboRoleProfile;

    @FXML
    private TextField strokeLactNameProfile;

    @FXML
    private TextField strokeLastWorkProfile;

    @FXML
    private TextField strokeLoginProfile;

    @FXML
    private TextField strokeNameProfile;

    @FXML
    private TextField strokeNumberPhoneProfile;

    @FXML
    private TextField strokePMJProfile;

    @FXML
    private TextField strokePasswordProfile;

    @FXML
    private TextField strokeSurnameProfile;

    @FXML
    void btnCancelProfile(ActionEvent event) {

    }

    @FXML
    void btnEditProfile(ActionEvent event) {

    }

//    @FXML
//    void btnOpenHome(ActionEvent event) {
//        MainApplication.showDialog("admin-main.fxml","Автостоянка 'PlaceCar'");
//    }

}
