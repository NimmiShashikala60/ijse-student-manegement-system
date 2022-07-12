import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class AppInitializer extends Application {
  public static void main(String args[]){

  }

    public void start(Stage primaryStage) throws IOException {
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/View/LoginDashboardForm.fxml "))));
        primaryStage.show();
    }
}

