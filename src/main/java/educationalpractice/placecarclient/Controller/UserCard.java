package educationalpractice.placecarclient.Controller;

import educationalpractice.placecarclient.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class UserCard {

    @FXML
    private Text txtBankCard;

    @FXML
    private Text txtCVVCard;

    @FXML
    private Text txtNameCard;

    @FXML
    private Text txtNumberCard;

    @FXML
    private Text txtPMAndPrice;

    @FXML
    private Text txtPMJProfile1;

    @FXML
    private Text txtSrokCard;

    @FXML
    private Text txtSumma;

    @FXML
    private Text txtTimeBron;

    @FXML
    private Text whoUser;

    @FXML
    void btnCancelBron(ActionEvent event) {

    }

    @FXML
    void btnHelp(ActionEvent event) {
        MainApplication.showDialog("help.fxml","Помощь");
    }

    @FXML
    void btnNext(ActionEvent event) {
        MainApplication.showDialog("OkRent.fxml","Автостоянка 'PlaceCar'");

    }

    @FXML
    void btnOpenCarUser(ActionEvent event) {
        MainApplication.showDialog("user-car.fxml","Автостоянка 'PlaceCar'");
    }

    @FXML
    void btnOpenEdtCard(ActionEvent event) {
        MainApplication.showDialog("user-card-bron.fxml","Автостоянка 'PlaceCar'");

    }

    @FXML
    void btnOpenHomeUser(ActionEvent event) {
        MainApplication.showDialog("user-main1.fxml","Автостоянка 'PlaceCar'");
    }

}
