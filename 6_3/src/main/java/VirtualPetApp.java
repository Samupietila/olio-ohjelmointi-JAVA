import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class VirtualPetApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pet pet = new Pet(200, 200);
        PetView petView = new PetView(pet);
        PetController petController = new PetController(pet, petView);

        primaryStage.setTitle("Virtual Pet");
        primaryStage.setScene(new Scene(petView, 400, 400));
        primaryStage.show();
    }
}

