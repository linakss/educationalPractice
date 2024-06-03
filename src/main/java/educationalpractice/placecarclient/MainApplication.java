package educationalpractice.placecarclient;
import

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;

public class MainApplication extends Application {
    private Stage stage;
    private FXMLLoader fxmlLoader;
    //private static WelcomeMain mainController; //поменять контроллер
    //private BorderPane rootLayout; вроде не нужно
    @Override
    public void start(Stage stage) throws IOException {
        fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Alert alert = new Alert(Alert.AlertType.NONE,  "Возникла ошибка!",
                ButtonType.CLOSE, ButtonType.OK);

        Button button = new Button("Понятно");

        button.setOnAction(e -> {
            alert.setAlertType(Alert.AlertType.CONFIRMATION);
            alert.show();
        });
        stage.setTitle("Автостоянка 'PlaceCar'");
        stage.setResizable(false);
        stage.setScene(scene);
        //mainController = fxmlLoader.getController(); //поменять контроллер
        stage.show();
    }

    public static void showDialog(String nameView, String title){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApplication.class.getResource(nameView));
            AnchorPane page = (AnchorPane) loader.load();
            Stage dialogStage = new Stage();
            dialogStage.setTitle(title);
            dialogStage.setResizable(false);
            dialogStage.initModality(Modality.WINDOW_MODAL);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);
            dialogStage.show();
        } catch (IOException l){
            Alert alert = new Alert(Alert.AlertType.NONE,  "Возникла ошибка!",
                    ButtonType.CLOSE, ButtonType.OK);

            Button button = new Button("Понятно");

            button.setOnAction(e -> {
                alert.setAlertType(Alert.AlertType.CONFIRMATION);
                alert.show();
            });
            l.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch();
    }
}