package TD2.Vue;

import TD2.Controller.EcouteurSouris;
import TD2.Controller.EcouteurTrace;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class ZoneDeDessin extends Canvas {
    private Color couleur;
    private double epaisseur;
    private double x, y;
    public EcouteurSouris EcoSou;


    public ZoneDeDessin(int t1, int t2) {
        super(t1, t2);
        this.couleur = Color.BLACK;
        this.epaisseur = 1;
        this.setFocusTraversable(true);
        this.EcoSou = new EcouteurTrace(this);

    }

    public void setEcoSou(EcouteurSouris ecoSou) {
        EcoSou = ecoSou;
    }

    public EcouteurSouris getEcoSou() {
        return EcoSou;
    }

    public void changeEpaisseur(double epaisseur) {
        GraphicsContext gc2D = this.getGraphicsContext2D();
        gc2D.setLineWidth(epaisseur);
        this.epaisseur = epaisseur;
    }

    public void changeCouleur(Color couleur) {
        GraphicsContext gc2d = this.getGraphicsContext2D();
        gc2d.setStroke(couleur);
        this.couleur = couleur;
    }


    public void dessineTrait(double x1, double x2, double y1, double y2) {
        GraphicsContext gc2d = this.getGraphicsContext2D();
        gc2d.strokeLine(x1, x2, y1, y2);
    }

}

