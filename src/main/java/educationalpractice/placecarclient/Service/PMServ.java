package educationalpractice.placecarclient.Service;

import com.google.gson.reflect.TypeToken;
import educationalpractice.placecarclient.Entity.PM;
import educationalpractice.placecarclient.Entity.PM;
import educationalpractice.placecarclient.Response.BaseResp;
import educationalpractice.placecarclient.Response.DataResp;
import educationalpractice.placecarclient.Response.ListResp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.Getter;

import java.lang.reflect.Type;
import java.util.Comparator;

public class PMServ {
    @Getter
    private ObservableList<PM> data = FXCollections.observableArrayList();
    private final HttpServ http = new HttpServ();
    JsonServ service = new JsonServ();
    ClientProperties prop = new ClientProperties();
    private Type dataType = new TypeToken<DataResp<PM>>() {
    }.getType();
    private Type listType = new TypeToken<ListResp<PM>>() {
    }.getType();

    public void findById(PM data) {
        String temp = http.get(prop.getFindByIdPm() + data.getIdPM());
        DataResp<PM> response = service.getObject(temp, dataType);
        if (response.isSuccess()) {
            this.data.add(response.getData());
        } else {
            throw new RuntimeException(response.getMessage());
        }
    }

    private void sort(){
        data.sort(Comparator.comparing(PM::getStatusPM));
    }

    public void getAll() {
        ListResp<PM> data = new ListResp<>();
        data = service.getObject(http.get(prop.getAllPm()), listType);
        if (data.isSuccess()) {
            this.data.addAll(data.getData());
            sort();
            this.data.forEach(System.out::println);
        } else {
            throw new RuntimeException(data.getMessage());
        }
    }
    public void add(PM data) {
        String temp = http.post(prop.getSavePm(), service.getJson(data));
        DataResp<PM> response = service.getObject(temp, dataType);
        if (response.isSuccess()) {
            this.data.add(response.getData());
            sort();
        } else {
            throw new RuntimeException(response.getMessage());
        }
    }

    public void update(PM after, PM before) {
        System.out.println(before);
        System.out.println(after);
        String temp = http.put(prop.getUpdatePm(), service.getJson(after));
        DataResp<PM> response = service.getObject(temp, dataType);
        if (response.isSuccess()) {
            this.data.remove(before);
            this.data.add(after);
            sort();
        } else {
            throw new RuntimeException(response.getMessage());
        }
    }

    public void delete(PM data){
        String temp = http.delete(prop.getDeletePm(), data.getIdPM());
        BaseResp response = service.getObject(temp,BaseResp.class);
        if (response.isSuccess()){
            this.data.remove(data);
        }else {
            throw new RuntimeException(response.getMessage());
        }
    }
}

