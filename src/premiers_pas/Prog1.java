package premiers_pas;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

/** Une première application JavaFX pour débuter
 * @author Brutus Philippe et Jeanpierre Laurent
 */
public class Prog1 extends Application {
	/** Point d'entrée du programme. Se limite à lancer le moteur JavaFX.
	 *
	 * @param args les arguments à passer au moteur JavaFX.
	 */
	public static void main(String[] args) {
	    Application.launch(args);
	}

	/** Première méthode à s'exécuter sur le Thread graphique */
	@Override
	public void start(Stage fenetre) {
        Group contenu = new Group();
        Scene scene = new Scene(contenu, 300, 200);
        fenetre.setScene(scene);
        fenetre.setTitle("Une première fenêtre en javaFX");
	    fenetre.show();
	}

} // public class Prog1
