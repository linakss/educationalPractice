package educationalpractice.placecarclient.Controller;

import educationalpractice.placecarclient.Entity.PM;
import educationalpractice.placecarclient.MainApplication;
import educationalpractice.placecarclient.Service.UserServ;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class UserMain1 {

    @FXML
    private Text greenPm;

    @FXML
    private Button numberPM1;

    @FXML
    private Button numberPM10;

    @FXML
    private Button numberPM2;

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
    private final UserServ service = new UserServ();
    private boolean addFlag = true;

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
    }

    @FXML
    void btnOpenPMs(ActionEvent event) {
        MainApplication.showDialog("user-main2.fxml","Автостоянка 'PlaceCar'");
    }

    @FXML
    void btnOpenProfile(ActionEvent event) {
        MainApplication.showDialog("user-profile.fxml","Автостоянка 'PlaceCar'");
    }

}
