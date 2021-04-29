package TD2.Modele;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Dessin{
    protected ArrayList<Figure> figure = new ArrayList<Figure>();

    public void ajoute(Figure figure1){
        figure.add(figure1);
    }

    public int nombreDElements(){

        return figure.size();
    }

    public Figure element(int nb){

        return figure.get(nb);
    }

    public void retire(int nb){
        figure.remove(nb);
    }

    public void vider(){
        figure.clear();
    }

    public Iterator<Figure> iterator(){
        return figure.iterator();
    }
}
