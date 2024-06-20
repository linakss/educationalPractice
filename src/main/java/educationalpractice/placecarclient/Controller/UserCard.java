package educationalpractice.placecarclient.Controller;

import educationalpractice.placecarclient.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import static educationalpractice.placecarclient.MainApplication.userAdmin;

public class UserCard {

    @FXML
    private Button btnCancelBron;

    @FXML
    private Button btnHelp;

    @FXML
    private Button btnNext;

    @FXML
    private Button btnOpenCarUser;

    @FXML
    private Button btnOpenEdtCard;

    @FXML
    private Button btnOpenHomeUser;

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
        Stage stage = (Stage) btnNext.getScene().getWindow();
        stage.close();
    }

    @FXML
    void btnOpenCarUser(ActionEvent event) {
        MainApplication.showDialog("user-car.fxml","Автостоянка 'PlaceCar'");
        Stage stage = (Stage) btnOpenCarUser.getScene().getWindow();
        stage.close();
    }

    @FXML
    void btnOpenEdtCard(ActionEvent event) {
        MainApplication.showDialog("user-card-bron.fxml","Автостоянка 'PlaceCar'");
//        Stage stage = (Stage) btnOpenEdtCard.getScene().getWindow();
//        stage.close();
    }

    @FXML
    void btnOpenHomeUser(ActionEvent event) {
        MainApplication.showDialog("user-main1.fxml","Автостоянка 'PlaceCar'");
        Stage stage = (Stage) btnOpenHomeUser.getScene().getWindow();
        stage.close();
    }
    @FXML
    private void initialize() {
        whoUser.setText(userAdmin.getSurname()+"\n"+userAdmin.getName()+"\n"+userAdmin.getSurname());
    }
}
