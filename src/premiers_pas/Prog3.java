package premiers_pas;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/** Une application qui dessine...
 * @author Brutus Philippe et Jeanpierre Laurent
 */
public class Prog3 extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) {
		Canvas canvas = new Canvas(600, 400);
		Group contenu = new Group(canvas);
		Scene scene = new Scene(contenu);
		stage.setScene(scene);
		stage.sizeToScene();
		stage.setTitle("Une fenêtre à contenu");
		stage.show();
		GraphicsContext gc2D = canvas.getGraphicsContext2D();
		dessine(gc2D);
	}

	/**
	 * Dessine sur le contexte spécifié.
	 *
	 * @param gc le contexte graphique où dessiner.
	 */
	private void dessine(GraphicsContext gc) {
		gc.setFont(new Font("Arial", 18));
		gc.strokeText("Bonjour", 200, 30);
		gc.setFill(Color.GREEN);
		gc.setStroke(Color.BLUE);
		gc.setLineWidth(5);
		gc.strokeLine(40, 10, 10, 40);
		gc.fillOval(10, 60, 30, 30);
		gc.strokeOval(60, 60, 30, 30);
		gc.fillRoundRect(110, 60, 30, 30, 10, 10);
		gc.strokeRoundRect(160, 60, 30, 30, 10, 10);
		gc.fillArc(10, 110, 30, 30, 45, 240, ArcType.OPEN);
		gc.fillArc(60, 110, 30, 30, 45, 240, ArcType.CHORD);
		gc.fillArc(110, 110, 30, 30, 45, 240, ArcType.ROUND);
		gc.strokeArc(10, 160, 30, 30, 45, 240, ArcType.OPEN);
		gc.strokeArc(60, 160, 30, 30, 45, 240, ArcType.CHORD);
		gc.strokeArc(110, 160, 30, 30, 45, 240, ArcType.ROUND);
		gc.fillPolygon(
				new double[]{10, 40, 10, 40},
				new double[]{210, 210, 240, 240}, 4);
		gc.strokePolygon(
				new double[]{60, 90, 60, 90},
				new double[]{210, 210, 240, 240}, 4);
		gc.strokePolyline(
				new double[]{110, 140, 110, 140},
				new double[]{210, 210, 240, 240}, 4);
	} // private dessine(gc)

} // public class Prog3
