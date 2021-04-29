package TD2.Controller;

import TD2.Vue.ZoneDeDessin;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public abstract class EcouteurSouris {
    protected double x, y;
    protected ZoneDeDessin zone;
    protected Color couleur;
    protected double epaisseur;


    public EcouteurSouris(ZoneDeDessin ZD) {
        this.zone = ZD;
    }

    public EcouteurSouris(ZoneDeDessin ZD, double x, double y){
        this.zone = ZD;
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public abstract void onDrag(MouseEvent evt);

    public abstract void removeEventHandler();

}
