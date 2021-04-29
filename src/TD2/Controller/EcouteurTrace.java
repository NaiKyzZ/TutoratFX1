package TD2.Controller;

import TD2.Vue.ZoneDeDessin;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.security.Key;

public class EcouteurTrace extends EcouteurSouris{

    public EcouteurTrace(ZoneDeDessin ZD) {
        super(ZD);
        this.zone = ZD;

        zone.addEventHandler(MouseEvent.MOUSE_CLICKED, this::onClick);
        zone.addEventHandler(MouseEvent.MOUSE_DRAGGED, this::onDrag);
        zone.addEventHandler(MouseEvent.MOUSE_PRESSED,this::onClick);
    }

    public EcouteurTrace(ZoneDeDessin ZD, double x, double y) {
        super(ZD, x, y);
        this.zone = ZD;
        zone.addEventHandler(MouseEvent.MOUSE_CLICKED, this::onClick);
        zone.addEventHandler(MouseEvent.MOUSE_DRAGGED, this::onDrag);
        zone.addEventHandler(MouseEvent.MOUSE_PRESSED,this::onClick);
    }

    public void onDrag(MouseEvent evt) {
        if (evt.getButton() == MouseButton.PRIMARY) {
            draw(evt);
        }
    }

    public void draw(MouseEvent evt) {
        GraphicsContext gc2D = zone.getGraphicsContext2D();
        gc2D.setStroke(couleur);
        gc2D.setLineWidth(epaisseur);
        gc2D.strokeLine(x, y, evt.getX(), evt.getY());
        x = evt.getX();
        y = evt.getY();
    }


    public void setCoord(MouseEvent evt){

        x = evt.getX();
        y = evt.getY();
    }

    public void onClick(MouseEvent evt) {
        if (evt.getButton() == MouseButton.PRIMARY) {
             setCoord (evt);
        }
    }

    @Override
    public void removeEventHandler()
    {
        zone.removeEventHandler(MouseEvent.MOUSE_CLICKED, this::onClick);
        zone.removeEventHandler(MouseEvent.MOUSE_DRAGGED, this::onDrag);
        zone.removeEventHandler(MouseEvent.MOUSE_PRESSED, this::onClick);
    }

}
