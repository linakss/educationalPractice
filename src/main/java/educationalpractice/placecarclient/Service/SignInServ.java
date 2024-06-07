package educationalpractice.placecarclient.Service;
import com.google.gson.reflect.TypeToken;
import educationalpractice.placecarclient.Entity.Employee;
import educationalpractice.placecarclient.MainApplication;
import educationalpractice.placecarclient.Response.DataResp;
import educationalpractice.placecarclient.Response.ListResp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.Getter;
import java.io.IOException;
import java.lang.reflect.Type;

//adminimport static educationalpractice.placecarclient.MainApplication.userAdmin;
import static educationalpractice.placecarclient.MainApplication.userAdmin;
import static educationalpractice.placecarclient.MainApplication.userInf;

public class SignInServ {
    @Getter
    private ObservableList<Employee> data = FXCollections.observableArrayList();
    private final ErrorAlertServ alertService = new ErrorAlertServ();
    private  final HttpServ http = new HttpServ();
    JsonServ service = new JsonServ();
    ClientProperties prop = new ClientProperties();
    private Type dataType = new TypeToken<DataResp<Employee>>() {
    }.getType();
    private Type listType = new TypeToken<ListResp<Employee>>() {
    }.getType();

//    public void add(Employee data){
//        String temp = http.post(prop.getSaveEmployee(), service.getJson(data));
//        DataResp<Employee> response = service.getObject(temp, dataType);
//        if (response.isSuccess()){
//            this.data.add(response.getData());
//        }else{
//            throw new RuntimeException(response.getMessage());
//        }
//    }

    public Employee checkEmployeeForAdmin(Employee data) throws IOException {
        String temp = http.get(prop.getCheckEmployee() + "?login="+data.getLogin()+"&password="+data.getPassword());

        DataResp<Employee> response = service.getObject(temp, dataType);

        if (response.isSuccess()){
            if (userInf.getRole().equals("Администратор")){
                userAdmin=userInf;
                MainApplication.startAdmin("Главная");}
            else {
                MainApplication.startUser("Главная");}
            return response.getData();
        }else{
            System.out.printf("error");
            alertService.didntfoundEmployee();
        }
        return null;
    }
}
