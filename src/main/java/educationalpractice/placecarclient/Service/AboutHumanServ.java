package educationalpractice.placecarclient.Service;

import com.google.gson.reflect.TypeToken;
import educationalpractice.placecarclient.Entity.AboutHuman;
import educationalpractice.placecarclient.Response.BaseResp;
import educationalpractice.placecarclient.Response.DataResp;
import educationalpractice.placecarclient.Response.ListResp;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.Getter;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class AboutHumanServ {
    @Getter
    private ObservableList<AboutHuman> data = FXCollections.observableArrayList();
    private final HttpServ http = new HttpServ();
    JsonServ service = new JsonServ();
    ClientProperties prop = new ClientProperties();
    private Type dataType = new TypeToken<DataResp<AboutHuman>>() {}.getType();
    private Type listType = new TypeToken<ListResp<AboutHuman>>() {}.getType();

    public List<AboutHuman> getCombinedData() {
        List<AboutHuman> combinedData = new ArrayList<>();
        // Здесь должен быть ваш код для получения данных из репозиториев и создания объектов AboutHuman
        return combinedData;
    }
    public void getAll() {
        ListResp<AboutHuman> data = new ListResp<>();
        data = service.getObject(http.get(prop.getAllAboutHuman()), listType);
        if (data.isSuccess()) {
            this.data.addAll(data.getData());
            this.data.forEach(System.out::println);
        } else {
            throw new RuntimeException(data.getMessage());
        }
    }

    public void add(AboutHuman data) {
        String temp = http.post(prop.getSaveAboutHuman(), service.getJson(data));
        DataResp<AboutHuman> response = service.getObject(temp, dataType);
        if (response.isSuccess()) {
            this.data.add(response.getData());
        } else {
            throw new RuntimeException(response.getMessage());
        }
    }

    public void update(AboutHuman data) {
        String temp = http.put(prop.getUpdateAboutHuman(), service.getJson(data));
        DataResp<AboutHuman> response = service.getObject(temp, dataType);
        if (response.isSuccess()) {
            this.data.remove(data);
            this.data.add(response.getData());
        } else {
            throw new RuntimeException(response.getMessage());
        }
    }

    //у последних двух на сервере нужно дописать TODO
    public void delete(AboutHuman data) {
        String temp = http.delete(prop.getDeleteAboutHuman(), data.getId());
        DataResp<AboutHuman> response = service.getObject(temp, BaseResp.class);
        if (response.isSuccess()) {
            this.data.remove(data);
        } else {
            throw new RuntimeException(response.getMessage());
        }
    }

    public void findById(AboutHuman data) {
        String temp = http.get(prop.getFindByIdAboutHuman() + data.getId());
        DataResp<AboutHuman> response = service.getObject(temp, dataType);
        if (response.isSuccess()) {
            this.data.add(response.getData());
        } else {
            throw new RuntimeException(response.getMessage());
        }
    }
}
