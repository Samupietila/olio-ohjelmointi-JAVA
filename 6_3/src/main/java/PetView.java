import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;

class PetView extends StackPane {
    private Pet pet;
    private Canvas canvas;

    public PetView(Pet pet) {
        this.pet = pet;
        canvas = new Canvas(400, 400);
        getChildren().add(canvas);
        drawPet();

        canvas.setOnMouseMoved(event -> {
            pet.moveTo(event.getX(), event.getY());
            drawPet();
        });
    }

    private void drawPet() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        gc.drawImage(new Image("pet.png.jpeg"), pet.getX(), pet.getY());
    }
}