package premiers_pas;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Gribouille0_2 extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    double x, y;

    Canvas canvas;

    @Override
    public void start(Stage stage) {
        this.canvas = new Canvas(600, 400);
        this.canvas.setFocusTraversable(true);
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

        canvas.setOnKeyPressed(this::setKeyPressed); //Pointeur vers la fonction

        Group contenu = new Group(canvas);
        Scene scene = new Scene(contenu);
        stage.setScene(scene);
        stage.setTitle("Une fenêtre avec gestion d'événement");
        stage.setResizable(false);
        stage.show();
    }



    private void setKeyPressed(KeyEvent e) {

        GraphicsContext gc2d = canvas.getGraphicsContext2D();
        switch (e.getCode()) {
            case N:
                gc2d.setStroke(Color.BLACK);
                break;
            case B:
                gc2d.setStroke(Color.BLUE);
                break;
            case J:
                gc2d.setStroke(Color.YELLOW);
                break;
            case V:
                gc2d.setStroke(Color.GREEN);
                break;
            case R:
                gc2d.setStroke(Color.RED);
                break;
            case DIGIT1:
                gc2d.setLineWidth(1);
                break;
            case DIGIT2:
                gc2d.setLineWidth(2);
                break;
            case DIGIT3:
                gc2d.setLineWidth(3);
                break;
            case DIGIT4:
                gc2d.setLineWidth(4);
                break;
            case DIGIT5:
                gc2d.setLineWidth(5);
                break;
            case DIGIT6:
                gc2d.setLineWidth(6);
                break;
            case DIGIT7:
                gc2d.setLineWidth(7);
                break;
            case DIGIT8:
                gc2d.setLineWidth(8);
                break;
            case DIGIT9:
                gc2d.setLineWidth(9);
                break;

        }
    }
}
