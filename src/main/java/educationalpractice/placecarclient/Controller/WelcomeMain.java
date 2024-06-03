package educationalpractice.placecarclient.Controller;

import educationalpractice.placecarclient.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class WelcomeMain {

    @FXML
    private TextField login;

    @FXML
    private TextField password;

    @FXML
    void btnHelp(ActionEvent event) {
        MainApplication.showDialog("help.fxml","Помощь");
    }

    @FXML
    void btnSignIn(ActionEvent event) {

    }

    @FXML
    void strokeLogin(ActionEvent event) {

    }

    @FXML
    void strokePassword(ActionEvent event) {

    }

}
