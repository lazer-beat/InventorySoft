package ru.aincorp.invesoft;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by Алмаз on 11.07.14.
 */
public class InventoryApplication extends Application {

    private static Logger logger = Logger.getLogger(String.valueOf(InventoryApplication.class));

    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("АРМ Опись оборудования (ver 0.0.0.1)");

        try {
            // загрузка корневого лейаута из fxml файла
            FXMLLoader loader = new FXMLLoader(InventoryApplication.class.getResource("/ru/aincorp/invesoft/view/inventoryRootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

        showInventoryCenterLayout();
    }

    /**
     * Возвращает главную stage.
     *
     * @return
     */
    public void showInventoryCenterLayout() {
        try {
            // Загружает fxml файл и устанавливает в центр главного Layout
            FXMLLoader loader = new FXMLLoader(InventoryApplication.class.getResource("/ru/aincorp/invesoft/view/inventoryCenterLayout.fxml"));
            AnchorPane overviewPage = (AnchorPane) loader.load();
            rootLayout.setCenter(overviewPage);

        } catch (IOException e) {
            // Выбрасывается исключение если fxml не может быть загружен
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
