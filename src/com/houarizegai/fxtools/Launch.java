
package com.houarizegai.fxtools;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Launch extends Application {
    public static Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/houarizegai/fxtools/tables/model1/Table.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("JavaFx Tools");
        Launch.stage = stage;
        //Launch.makeStageTransparent();
        stage.show();
    }

    public static void makeStageTransparent() {
        stage.getScene().setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.TRANSPARENT);
    }

}
