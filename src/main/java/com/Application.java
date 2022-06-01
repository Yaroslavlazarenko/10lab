package com;

import com.classes.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Scanner;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) {
        Scanner scanner = new Scanner(System.in);
        int example = 1;
        System.out.print("Task \n1 - rectangle, \n2 - parallelepiped;  \nInput number: ");
        example = scanner.nextInt();

        if (example == 1) {
            TableView<RectangleInfo> table = new TableView<>();
            TableColumn<RectangleInfo, String> lengthCol = new TableColumn<>("Length");
            TableColumn<RectangleInfo, String> widthCol = new TableColumn<>("Width");
            TableColumn<RectangleInfo, String> diagonalCol = new TableColumn<>("Diagonal");
            TableColumn<RectangleInfo, String> perimeterCol = new TableColumn<>("Perimeter");
            TableColumn<RectangleInfo, String> areaCol = new TableColumn<>("Area");

            lengthCol.setCellValueFactory(new PropertyValueFactory<>("length"));
            widthCol.setCellValueFactory(new PropertyValueFactory<>("width"));
            diagonalCol.setCellValueFactory(new PropertyValueFactory<>("diagonal"));
            perimeterCol.setCellValueFactory(new PropertyValueFactory<>("perimeter"));
            areaCol.setCellValueFactory(new PropertyValueFactory<>("area"));

            lengthCol.setSortType(TableColumn.SortType.DESCENDING);
            widthCol.setSortType(TableColumn.SortType.DESCENDING);
            diagonalCol.setSortType(TableColumn.SortType.DESCENDING);
            areaCol.setSortType(TableColumn.SortType.DESCENDING);
            perimeterCol.setSortType(TableColumn.SortType.DESCENDING);

            ObservableList<RectangleInfo> list = getRectanglesList();
            table.setItems(list);

            table.getColumns().addAll(lengthCol, widthCol, diagonalCol, areaCol, perimeterCol);

            StackPane root = new StackPane();
            root.setPadding(new Insets(5));
            root.getChildren().add(table);

            stage.setTitle("Rectangles Database");
            Scene scene = new Scene(root, 700, 300);
            stage.setScene(scene);
            stage.show();
        } else {
            TableView<ParallelepipedInfo> table = new TableView<>();
            TableColumn<ParallelepipedInfo, String> lengthCol = new TableColumn<>("Side");
            TableColumn<ParallelepipedInfo, String> widthCol = new TableColumn<>("Height");
            TableColumn<ParallelepipedInfo, String> heightCol = new TableColumn<>("Base Height");
            TableColumn<ParallelepipedInfo, String> diagonalCol = new TableColumn<>("Apothem");
            TableColumn<ParallelepipedInfo, String> areaCol = new TableColumn<>("Area");
            TableColumn<ParallelepipedInfo, String> volumeCol = new TableColumn<>("Volume");

            lengthCol.setCellValueFactory(new PropertyValueFactory<>("length"));
            widthCol.setCellValueFactory(new PropertyValueFactory<>("width"));
            heightCol.setCellValueFactory(new PropertyValueFactory<>("height"));
            diagonalCol.setCellValueFactory(new PropertyValueFactory<>("diagonal"));
            areaCol.setCellValueFactory(new PropertyValueFactory<>("area"));
            volumeCol.setCellValueFactory(new PropertyValueFactory<>("volume"));


            lengthCol.setSortType(TableColumn.SortType.DESCENDING);
            widthCol.setSortType(TableColumn.SortType.DESCENDING);
            heightCol.setSortType(TableColumn.SortType.DESCENDING);
            diagonalCol.setSortType(TableColumn.SortType.DESCENDING);
            areaCol.setSortType(TableColumn.SortType.DESCENDING);
            volumeCol.setSortType(TableColumn.SortType.DESCENDING);

            ObservableList<ParallelepipedInfo> list = getParallelepipedsList();
            table.setItems(list);

            table.getColumns().addAll(lengthCol, widthCol, heightCol, diagonalCol, areaCol, volumeCol);

            StackPane root = new StackPane();
            root.setPadding(new Insets(5));
            root.getChildren().add(table);

            stage.setTitle("Parallelepiped Database");
            Scene scene = new Scene(root, 800, 300);
            stage.setScene(scene);
            stage.show();
        }


    }

    private ObservableList<RectangleInfo> getRectanglesList() {
        RectanglesDatabase rectanglesDatabase = new RectanglesDatabase();
        fillRectanglesDatabase(rectanglesDatabase);

        ObservableList<RectangleInfo> list = FXCollections.observableArrayList();
        for (int i = 0; i < rectanglesDatabase.getRectangleList().size(); i++) {
            list.add(new RectangleInfo(
                    rectanglesDatabase.getRectangleFromList(i).getRectangleLength(),
                    rectanglesDatabase.getRectangleFromList(i).getRectangleWidth(),
                    rectanglesDatabase.getRectangleFromList(i).getRectangleDiagonal(),
                    rectanglesDatabase.getRectangleFromList(i).getRectangleArea(),
                    rectanglesDatabase.getRectangleFromList(i).getRectanglePerimeter()
            ));
        }

        return list;
    }

    private ObservableList<ParallelepipedInfo> getParallelepipedsList() {
        ParallelepipedsDatabase parallelepipedsDatabase = new ParallelepipedsDatabase();
        fillParallelepipedsDatabase(parallelepipedsDatabase);

        ObservableList<ParallelepipedInfo> list = FXCollections.observableArrayList();
        for (int i = 0; i < parallelepipedsDatabase.getParallelepipedList().size(); i++) {
            list.add(new ParallelepipedInfo(
                    parallelepipedsDatabase.getParallelepipedFromList(i).getParallelepipedLength(),
                    parallelepipedsDatabase.getParallelepipedFromList(i).getParallelepipedWidth(),
                    parallelepipedsDatabase.getParallelepipedFromList(i).getParallelepipedHeight(),
                    parallelepipedsDatabase.getParallelepipedFromList(i).getParallelepipedDiagonal(),
                    parallelepipedsDatabase.getParallelepipedFromList(i).getParallelepipedArea(),
                    parallelepipedsDatabase.getParallelepipedFromList(i).getParallelepipedVolume()
            ));
        }

        return list;
    }

    public static void fillParallelepipedsDatabase(ParallelepipedsDatabase parallelepipedsDatabase) {
        double width;
        double height;
        double length;
        int parallelepipedsIndex = 0;

        while (parallelepipedsIndex < 10) {
            width = (10 + ((Math.random()) * 10));
            height = (10 + ((Math.random()) * 10));
            length = (10 + ((Math.random()) * 10));
            parallelepipedsDatabase.add(new Parallelepiped(length, width, height));
            parallelepipedsIndex++;
        }
    }

    public static void fillRectanglesDatabase(RectanglesDatabase rectanglesDatabase) {
        double length;
        double width;
        int rectangleIndex = 0;

        while (rectangleIndex < 10) {
            length = (10 + ((Math.random()) * 10));
            width = (10 + ((Math.random()) * 10));
            rectanglesDatabase.add(new Rectangle(length, width));
            rectangleIndex++;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}