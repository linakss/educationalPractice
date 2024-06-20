package educationalpractice.placecarclient.Controller;

import educationalpractice.placecarclient.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static educationalpractice.placecarclient.MainApplication.userAdmin;

public class UserMain2 {

    @FXML
    private Button btnBronPM;

    @FXML
    private Button btnCancelPM;

    @FXML
    private Button btnOpenCar;

    @FXML
    private Button btnOpenProfile;

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
    private TextField txtEntryPm;

    @FXML
    private TextField txtEntryPm1;

    @FXML
    private Text txtNumberPMBron;

    @FXML
    private Text txtRyadBron;

    @FXML
    private Text txtSumma;

    @FXML
    private Text txtTimeBron;

    @FXML
    private Text txtTimeBron1;

    @FXML
    private Text yellowPm;
    @FXML
    private Text whoUser;

    @FXML
    void OnNumberPM1(ActionEvent event) {

    }

    @FXML
    void btnBronPM(ActionEvent event) {
        MainApplication.showDialog("user-card.fxml","Автостоянка 'PlaceCar'");
        Stage stage = (Stage) btnBronPM.getScene().getWindow();
        stage.close();
    }

    @FXML
    void btnCancelPM(ActionEvent event) {

    }

    @FXML
    void btnOpenCar(ActionEvent event) {
        MainApplication.showDialog("user-car.fxml","Автостоянка 'PlaceCar'");
        Stage stage = (Stage) btnOpenCar.getScene().getWindow();
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
        whoUser.setText(userAdmin.getSurname()+"\n"+userAdmin.getName()+"\n"+userAdmin.getSurname());
    }
}
