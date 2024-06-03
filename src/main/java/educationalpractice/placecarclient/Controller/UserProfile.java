package educationalpractice.placecarclient.Controller;

import educationalpractice.placecarclient.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class UserProfile {

    @FXML
    private Text txtLastNameProfile;

    @FXML
    private Text txtLastWorkProfile;

    @FXML
    private Text txtNameProfile;

    @FXML
    private Text txtPMJProfile;

    @FXML
    private Text txtPMJProfile1;

    @FXML
    private Text txtPhoneNumberProfile;

    @FXML
    private Text txtSurnameProfile;

    @FXML
    private Text whoUser;

    @FXML
    void btnHelp(ActionEvent event) {
        MainApplication.showDialog("help.fxml","Помощь");
    }

    @FXML
    void btnOpenCarUser(ActionEvent event) {
        MainApplication.showDialog("user-car.fxml","Автостоянка 'PlaceCar'");
    }

    @FXML
    void btnOpenHomeUser(ActionEvent event) {
        MainApplication.showDialog("user-main1.fxml","Автостоянка 'PlaceCar'");
    }

}
