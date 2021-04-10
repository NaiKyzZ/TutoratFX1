package premiers_pas;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/** Premier gestionnaire d'événements. Variante 1
 * @author Brutus Philippe et Jeanpierre Laurent
 */
public class Prog4_1_1 extends Application {

  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage stage) {
    Canvas canvas = new Canvas(600, 400);
    canvas.addEventHandler(MouseEvent.MOUSE_MOVED, new EventHandler<MouseEvent>() {
      public void handle(MouseEvent event) {
        GraphicsContext gc2D = canvas.getGraphicsContext2D();
        gc2D.strokeText(".", event.getX(), event.getY());
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
