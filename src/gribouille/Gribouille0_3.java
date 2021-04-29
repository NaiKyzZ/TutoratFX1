package gribouille;

import TD2.Controller.EcouteurClavier;
import TD2.Controller.EcouteurSouris;
import TD2.Controller.EcouteurTrace;
import TD2.Vue.ZoneDeDessin;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Une correction possible du TP1
 *
 * @author Brutus Philippe et Jeanpierre Laurent
 */
public class Gribouille0_3 extends Application {

    public static void main(String[] args) {

        Application.launch(args);
    }


    @Override
    public void start(Stage stage) {

        ZoneDeDessin zone = new ZoneDeDessin(600, 400);

        EcouteurClavier EcoCla = new EcouteurClavier(zone);

        Group contenu = new Group(zone);
        Scene scene = new Scene(contenu);

        stage.setScene(scene);
        stage.sizeToScene();
        stage.setTitle("Une application de dessin en couleur");
        stage.show();
        stage.setResizable(true);
        zone.widthProperty().bind(stage.widthProperty()); //ardoise magique
        zone.heightProperty().bind(stage.heightProperty());


       /* canvas.setOnMousePressed((MouseEvent evt) -> {
            if (evt.getButton() == MouseButton.PRIMARY) {
                x = evt.getX();
                y = evt.getY();
            }
        });
        canvas.setOnMouseDragged((MouseEvent evt) -> {
            if (evt.getButton() == MouseButton.PRIMARY) {
                GraphicsContext gc2D = canvas.getGraphicsContext2D();
                gc2D.setStroke(couleur);
                gc2D.setLineWidth(epaisseur);
                gc2D.strokeLine(x, y, evt.getX(), evt.getY());
                x = evt.getX();
                y = evt.getY();
            }
        });*/



   /* scene.addEventHandler(KeyEvent.KEY_PRESSED, (KeyEvent evt) -> {
      if (evt.getText().length() == 0) return;
      char choix = evt.getText().charAt(0);
      if (Character.isDigit(choix)) {
        epaisseur = Character.digit(choix, 10);
      } else {
        switch (Character.toUpperCase(choix)) {
          case 'R':
            couleur = Color.RED;
            break;
          case 'V':
            couleur = Color.GREEN;
            break;
          case 'B':
            couleur = Color.BLUE;
            break;
          case 'J':
            couleur = Color.YELLOW;
            break;
          case 'N':
            couleur = Color.BLACK;
            break;
        }
      }
    }); // scene.addEventHandler(...)*/


    } // start(stage)

} // public class Gribouille0_3
