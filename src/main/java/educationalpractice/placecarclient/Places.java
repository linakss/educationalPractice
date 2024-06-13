package educationalpractice.placecarclient;

import educationalpractice.placecarclient.Entity.PM;
import educationalpractice.placecarclient.Service.PMServ;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import static educationalpractice.placecarclient.Controller.AdminMain.btnEditPMColor;

public class Places {
    PM pm = new PM();
    PMServ serv = new PMServ();

    public GridPane createGridPanel() {

         final int SIZE = 10;
            int bb = 19;
        GridPane grid = new GridPane();

        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J","K","L","M","N","O","P","Q","R","S"};
        for (int i = 0; i < bb; i++) {
            Label label = new Label(letters[i]);
            GridPane.setConstraints(label, i + 1, 0);
            grid.getChildren().add(label);
        }

// Add labels with numbers
        for (int i = 0; i < SIZE; i++) {
            Label label = new Label(String.valueOf(i + 1));
            GridPane.setConstraints(label, 0, i + 1);
            grid.getChildren().add(label);
        }

// Add buttons to represent cells
        Button[][] cells = new Button[bb][SIZE];

        for (int i = 0; i < bb; i++) {
            for (int k=1; k<9;k++)
            for (int j = 0; j < SIZE; j++) {
                Button cell = new Button();
                cell.setText(String.valueOf(k++));
                cell.setPrefSize(30, 30);
                cell.setOnMouseClicked(e -> {
                    Button source = (Button) e.getSource();
                    int colIndex = GridPane.getColumnIndex(source)-1;
                    int rowIndex = GridPane.getRowIndex(source)-1;

                    // Получаем текст кнопки
                    String buttonText = source.getText();

                    String columnLetter = letters[colIndex];


                    System.out.println("Кнопка: " + buttonText + ", Столбец: " + columnLetter + ", Строка: " + (rowIndex+1));

                    pm.setRyadPM(columnLetter);

                    pm.setNumberPM(Integer.parseInt(buttonText));



                    if (cell.getStyle().equals("-fx-background-color: #05d5d5;") && e.getClickCount()==2) {
                        cell.setStyle("");
                        //Здесь нужно прописать поиск по столбцу, таблице и номеру парковочного места
                        //




                    } else {
                        pm.setStatusPM("Забронировано");
                        cell.setStyle("-fx-background-color: #05d5d5;");
                        serv.add(pm);

                    }
                });
                cells[i][j] = cell;
                GridPane.setConstraints(cell, i + 1, j + 1);
                grid.getChildren().add(cell);

            }
        }

        // Заполнение gridPanel числами...
        return grid;
    }















//    int number;
//    int[] column = new int[26];
//
//    private static final int SIZE = 10;
//
//
//    public static void starik(Stage primaryStage) {
//        GridPane grid = new GridPane();
//
//// Add labels with letters
//        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
//        for (int i = 0; i < SIZE; i++) {
//            Label label = new Label(letters[i]);
//            GridPane.setConstraints(label, i + 1, 0);
//            grid.getChildren().add(label);
//        }
//
//// Add labels with numbers
//        for (int i = 0; i < SIZE; i++) {
//            Label label = new Label(String.valueOf(i + 1));
//            GridPane.setConstraints(label, 0, i + 1);
//            grid.getChildren().add(label);
//        }
//
//// Add buttons to represent cells
//        Button[][] cells = new Button[SIZE][SIZE];
//        for (int i = 0; i < SIZE; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                Button cell = new Button();
//                cell.setPrefSize(30, 30);
//                cell.setOnAction(e -> {
//                    if (cell.getStyle().equals("-fx-background-color: lightblue;")) {
//                        cell.setStyle("");
//                    } else {
//                        cell.setStyle("-fx-background-color: lightblue;");
//                    }
//                });
//                cells[i][j] = cell;
//                GridPane.setConstraints(cell, i + 1, j + 1);
//                grid.getChildren().add(cell);
//            }
//        }
//
//        Scene scene = new Scene(grid, 400, 400);
//        primaryStage.setTitle("Battleship Table");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }


}

