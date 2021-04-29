package TD2.Controller;

import TD2.Vue.ZoneDeDessin;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class EcouteurEtoile extends EcouteurSouris{

    public EcouteurEtoile(ZoneDeDessin ZD) {
        super(ZD);

        zone.setOnMousePressed(this::onClick);
        zone.setOnMouseDragged(this::draw);
    }

    @Override
    public void onDrag(MouseEvent evt) {

    }

    @Override
    public void removeEventHandler() {

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


    public void draw(MouseEvent evt) {
        GraphicsContext gc2D = zone.getGraphicsContext2D();
        gc2D.setStroke(couleur);
        gc2D.setLineWidth(epaisseur);
        gc2D.strokeLine(x, y, evt.getX(), evt.getY());
    }

}
