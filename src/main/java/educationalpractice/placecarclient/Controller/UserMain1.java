package educationalpractice.placecarclient.Controller;

import educationalpractice.placecarclient.Entity.PM;
import educationalpractice.placecarclient.MainApplication;
import educationalpractice.placecarclient.Service.CarServ;
import educationalpractice.placecarclient.Service.EmployeeServ;
import educationalpractice.placecarclient.Service.UserServ;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static educationalpractice.placecarclient.MainApplication.userAdmin;

public class UserMain1 {

    @FXML
    private Button OnNumberPMa;

    @FXML
    private Button OnNumberPMb;

    @FXML
    private Button btnCancelRyadPM;

    @FXML
    private Button btnOpenCar;

    @FXML
    private Button btnOpenPMs;

    @FXML
    private Button btnOpenProfile;

    @FXML
    private Text greenPm;

    @FXML
    private Button numberPM10;

    @FXML
    private Button numberPM3;

    @FXML
    private Button numberPM4;

    @FXML
    private Button numberPM5;

    @FXML
    private Button numberPM6;

    @FXML
    private Button numberPM61;

    @FXML
    private Button numberPM610;

    @FXML
    private Button numberPM611;

    @FXML
    private Button numberPM612;

    @FXML
    private Button numberPM613;

    @FXML
    private Button numberPM614;

    @FXML
    private Button numberPM615;

    @FXML
    private Button numberPM62;

    @FXML
    private Button numberPM63;

    @FXML
    private Button numberPM64;

    @FXML
    private Button numberPM65;

    @FXML
    private Button numberPM66;

    @FXML
    private Button numberPM67;

    @FXML
    private Button numberPM68;

    @FXML
    private Button numberPM69;

    @FXML
    private Button numberPM7;

    @FXML
    private Button numberPM8;

    @FXML
    private Button numberPM9;

    @FXML
    private Text redPm;

    @FXML
    private Text textPrice;

    @FXML
    private Text textPrice1;

    @FXML
    private Text yellowPm;
    @FXML
    private Text whoUser;
    private final EmployeeServ serviceEmpl = new EmployeeServ();

    @FXML
    void OnNumberPMa(ActionEvent event) {

    }

    @FXML
    void OnNumberPMb(ActionEvent event) {

    }
    private final UserServ serviceUser = new UserServ();

    @FXML
    void OnNumberPM1(ActionEvent event) {
//        PM pm = new PM();
//        pm.setRyadPM();
//        if (addFlag) {
//
//        }
    }

    @FXML
    void btnCancelRyadPM(ActionEvent event) {

    }

    @FXML
    void btnOpenCar(ActionEvent event) {
        MainApplication.showDialog("user-car.fxml","Автостоянка 'PlaceCar'");
        Stage stage = (Stage) btnOpenCar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void btnOpenPMs(ActionEvent event) {
        MainApplication.showDialog("user-main2.fxml","Автостоянка 'PlaceCar'");
        Stage stage = (Stage) btnOpenPMs.getScene().getWindow();
        stage.close();
    }

    @FXML
    void btnOpenProfile(ActionEvent event) {
        MainApplication.showDialog("user-profile.fxml","Автостоянка 'PlaceCar'");
        Stage stage = (Stage) btnOpenProfile.getScene().getWindow();
        stage.close();
    }
    @FXML
    private void initialize() {
        serviceEmpl.getAll();
        whoUser.setText(userAdmin.getSurname()+"\n"+userAdmin.getName()+"\n"+userAdmin.getSurname());
    }
}
