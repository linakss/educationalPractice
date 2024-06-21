package educationalpractice.placecarclient.Controller;

import educationalpractice.placecarclient.Entity.Car;
import educationalpractice.placecarclient.Entity.Employee;
import educationalpractice.placecarclient.MainApplication;
import educationalpractice.placecarclient.Service.CarServ;
import educationalpractice.placecarclient.Service.EmployeeServ;
import educationalpractice.placecarclient.Service.ErrorAlertServ;
import educationalpractice.placecarclient.Service.UserServ;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import lombok.Getter;
import lombok.Setter;

import java.util.Optional;

public class AdminEmployeeEdit {
    @FXML
    private TextField strokeRoleProfile;
    @FXML
    private TextField strokeLactNameProfile;
    @FXML
    private TextField strokeLastWorkProfile;
    @FXML
    private TextField strokeLoginProfile;
    @FXML
    private Button btnCancelProfile;
    @FXML
    private Button btnEditProfile;
    @FXML
    private TextField strokeNameProfile;
    @FXML
    private TextField strokeNumberPhoneProfile;
    @FXML
    private TextField strokePasswordProfile;
    @FXML
    private TextField strokeSurnameProfile;
    private final EmployeeServ service = new EmployeeServ();
    private final ErrorAlertServ alertService = new ErrorAlertServ();
    private boolean addFlag = true;
    @Setter
    @Getter
    private Optional<Employee> employee;
    @FXML
    private void initialize(){
        service.getAll();
    }
    @FXML
    void btnCancelProfile(ActionEvent event) {
        Stage stage = (Stage) btnCancelProfile.getScene().getWindow();
        stage.close();
    }
    @FXML
    void btnEditProfile(ActionEvent event) {
        try{
            Employee temp =   Employee.builder()
                    .name(strokeNameProfile.getText())
                    .lastname(strokeLactNameProfile.getText())
                    .surname(strokeSurnameProfile.getText())
                    .password(strokePasswordProfile.getText())
                    .login(strokeLoginProfile.getText())
                    .numberPhone(strokeNumberPhoneProfile.getText())
                    .role(strokeRoleProfile.getText())
                    .build();
            if (employee.isEmpty()){
                employee = Optional.of(temp);}
            else {
                temp.setIdEmployee(employee.get().getIdEmployee());
            }
            System.out.println(temp);
            employee = Optional.of(temp);
        }catch (Exception e){
            alertService.addVoid(e);
        }
        Stage stage = (Stage) btnEditProfile.getScene().getWindow();
        stage.close();
    }
    public  void  start2(){
        if (employee.isPresent()){
            strokeSurnameProfile.setText(employee.get().getSurname());
            strokeLactNameProfile.setText(employee.get().getLastname());
            strokeLoginProfile.setText(employee.get().getLogin());
            strokeNameProfile.setText(employee.get().getName());
            strokePasswordProfile.setText(employee.get().getPassword());
            strokeNumberPhoneProfile.setText(employee.get().getNumberPhone());
            strokeRoleProfile.setText(employee.get().getRole());
        }
    }
}
