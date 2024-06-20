package educationalpractice.placecarclient.Controller;

import educationalpractice.placecarclient.Entity.AboutHuman;
import educationalpractice.placecarclient.Entity.Car;
import educationalpractice.placecarclient.Entity.Employee;
import educationalpractice.placecarclient.Service.AboutHumanServ;
import educationalpractice.placecarclient.Service.EmployeeServ;
import educationalpractice.placecarclient.Service.ErrorAlertServ;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

public class AdminCarsEdit {
    @FXML
    private Button btnCancelEditCar;

    @FXML
    private Button btnSaveEditCar;

    @FXML
    private ComboBox<AboutHuman> comboHumanCar;

    @FXML
    private TextField strokeColorCar;

    @FXML
    private TextField strokeGosNumberCar;

    @FXML
    private TextField strokeMarkCar;

    @FXML
    private TextField strokeModelCar;
    private boolean addFlag = true;

    private final ErrorAlertServ alertService = new ErrorAlertServ();
    private final AboutHumanServ service = new AboutHumanServ ();
    @Setter
    @Getter
    private Optional<Car> car;


    @FXML
    private void initialize() {
        service.getAll();
        comboHumanCar.setItems(service.getData());

    }

    @FXML
    void btnCancelEditCar(ActionEvent event) {
        Stage stage = (Stage) btnCancelEditCar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void btnSaveEditCar(ActionEvent event) {
        try {
            AboutHuman car = new AboutHuman();
            car.setLesson(textLesson.getText());
            car.setSpecial(comboboxSpecial.getSelectionModel().getSelectedItem());
            if (addFlag) {
                service.add(car);
            } else {
                car.setId(getSelectionElement().getId());
                service.update(car, getSelectionElement());
            }
            textLesson.clear();
        }catch (Exception e){
            alertService.addVoid(e);
        }
        Stage stage = (Stage) saveLesson.getScene().getWindow();
        stage.close();


//        Car temp = Car.builder().colorCar(strokeColorCar.getText())
//                .gosNumberCar(strokeGosNumberCar.getText())
//                .markCar(strokeMarkCar.getText())
//                .modelCar(strokeModelCar.getText())
//                .user(comboHumanCar.getSelectionModel().getSelectedItem().getUser()) // без .getUser() не работает почему?
//                .build();
//        car = Optional.of(temp);
//        Stage stage = (Stage) btnSaveEditCar.getScene().getWindow();
//        System.out.println(temp);
    }

}