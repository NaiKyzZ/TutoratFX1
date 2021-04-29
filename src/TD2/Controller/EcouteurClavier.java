package TD2.Controller;

import TD2.Vue.ZoneDeDessin;
import gribouille.Gribouille0_3;
import javafx.event.Event;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.paint.Color;

public class EcouteurClavier {
    protected double x, y;
    protected ZoneDeDessin zone;
    protected double epaisseur;
    protected Color couleur;
    protected boolean alwaysTrace = false;

    public EcouteurClavier(ZoneDeDessin ZD) {
        this.zone = ZD;
        zone.addEventHandler(KeyEvent.KEY_PRESSED, (this::onKeyPressed));
    }


    public void onKeyPressed(KeyEvent evt) {
        if (evt.getText().length() == 0) return;
        char choix = evt.getText().charAt(0);
        if (Character.isDigit(choix)) {
            zone.changeEpaisseur(Character.digit(choix, 10));
        } else {
            switch (Character.toUpperCase(choix)) {
                case 'R':
                    zone.changeCouleur(Color.RED);
                    break;
                case 'V':
                    zone.changeCouleur(Color.GREEN);
                    break;
                case 'B':
                    zone.changeCouleur(Color.BLUE);
                    break;
                case 'J':
                    zone.changeCouleur(Color.YELLOW);
                    break;
                case 'N':
                    zone.changeCouleur(Color.BLACK);
                    break;
                /*case 'T':
                    zone.getEcoSou().removeEventHandler();
                    x = zone.getEcoSou().getX();
                    y = zone.getEcoSou().getY();
                    if (alwaysTrace){
                        zone.setEcoSou(new EcouteurTrace(zone,x,y));
                    } else {
                        zone.setEcoSou(new EcouteurAlwaysTrace(zone,x,y));
                    }
                    alwaysTrace = !alwaysTrace;
                    break;*/
                case 'S':
                    zone.setEcoSou(new EcouteurEtoile(zone));
                    break;
            }
        }
    }
}
