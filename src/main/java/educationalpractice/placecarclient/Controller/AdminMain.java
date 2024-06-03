package educationalpractice.placecarclient.Controller;

import educationalpractice.placecarclient.Entity.PM;
import educationalpractice.placecarclient.MainApplication;
import educationalpractice.placecarclient.Service.PMServ;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;

public class AdminMain {
    private final PMServ service = new PMServ();

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
    private void initialize(){
        //получаем все PM с сервера
        service.getAll();
        //связываем поля таблицы со столбцами
        //columnAuthor.setCellValueFactory(new PropertyValueFactory<BookEntity, String>("author"));
        tablePM.setItems(service.getData());
    }

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
    }

    @FXML
    void btnOpenEmployee(ActionEvent event) {
        MainApplication.showDialog("admin-employee.fxml","Автостоянка 'PlaceCar'");
    }

}
