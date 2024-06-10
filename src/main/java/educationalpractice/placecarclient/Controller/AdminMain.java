package educationalpractice.placecarclient.Controller;

import educationalpractice.placecarclient.Entity.PM;
import educationalpractice.placecarclient.MainApplication;
import educationalpractice.placecarclient.Places;
import educationalpractice.placecarclient.Service.PMServ;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static educationalpractice.placecarclient.MainApplication.userAdmin;

public class AdminMain {
    private final PMServ service = new PMServ();
    @FXML
    private Button btnEditPM;

    @FXML
    private Button btnEditPMColor;

    @FXML
    private TableView<PM> tablePM;

    @FXML
    private Text textCar;

    @FXML
    private Text textEntryDeparture;

    @FXML
    private Text textFIO;

    @FXML
    private Text textNumberCar;

    @FXML
    private Text textNumberPhone;
    @FXML
    private Button btnOpenCars;

    @FXML
    private Button btnOpenEmployee;
    @FXML
    private Text whoUser;

//    Places [] place = new Places[10];
//    place [0]= new Places(0,0);
    @FXML
    void btnEditPM(ActionEvent event) {
        MainApplication.showDialog("admin-main-edit.fxml","Автостоянка 'PlaceCar'");
    }

    @FXML
    void btnEditPMColor(ActionEvent event) {

    }

    @FXML
    void btnOpenCars(ActionEvent event) {
        MainApplication.showDialog("admin-cars.fxml","Автостоянка 'PlaceCar'");
        Stage stage = (Stage) btnOpenCars.getScene().getWindow();
        stage.close();
    }

    @FXML
    void btnOpenEmployee(ActionEvent event) {
        MainApplication.showDialog("admin-employee.fxml","Автостоянка 'PlaceCar'");
        Stage stage = (Stage) btnOpenEmployee.getScene().getWindow();
        stage.close();
    }
    @FXML
    private void initialize() {
        whoUser.setText(userAdmin.getSurname());
        if (userAdmin.getRole().equals("Администратор")) { //роль равна админу или охране
            btnEditPM.setVisible(true);

        } else {
            btnEditPM.setVisible(false);

        }
    }
}
