package premiers_pas;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Gribouille0_1 extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    double x, y;

    @Override
    public void start(Stage stage) {
        Canvas canvas = new Canvas(600, 400);
        canvas.setOnMousePressed(event -> {

            x = event.getX();
            y = event.getY();

        });

        canvas.addEventHandler(MouseEvent.MOUSE_DRAGGED, new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                GraphicsContext gc2D = canvas.getGraphicsContext2D();
                gc2D.strokeLine(x, y, event.getX(), event.getY());
                x = event.getX();
                y = event.getY();
            }

        });

        Group contenu = new Group(canvas);
        Scene scene = new Scene(contenu);
        stage.setScene(scene);
        stage.setTitle("Une fenêtre avec gestion d'événement");
        stage.setResizable(false);
        stage.show();
    }
}
