package TD2.Controller;

import TD2.Vue.ZoneDeDessin;
import javafx.event.Event;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class EcouteurAlwaysTrace extends EcouteurTrace {

    public EcouteurAlwaysTrace(ZoneDeDessin ZD) {
        super(ZD);
        zone.addEventHandler(MouseEvent.MOUSE_MOVED, (MouseEvent evt)-> {draw(evt); });
        zone.addEventHandler(MouseEvent.MOUSE_PRESSED,this::onClick);
    }

    public EcouteurAlwaysTrace(ZoneDeDessin ZD, double x, double y) {
        super(ZD, x, y);
        zone.addEventHandler(MouseEvent.MOUSE_MOVED, (MouseEvent evt)-> {draw(evt); });
        zone.addEventHandler(MouseEvent.MOUSE_PRESSED,this::onClick);
    }

    @Override
    public void removeEventHandler()
    {
        zone.removeEventHandler(MouseEvent.MOUSE_DRAGGED, (MouseEvent evt)-> {draw(evt); });
        zone.removeEventHandler(MouseEvent.MOUSE_MOVED,(MouseEvent evt)-> {draw(evt); });
        zone.removeEventHandler(MouseEvent.MOUSE_PRESSED, this::onClick);
    }

    public void drag(MouseEvent evt) {
        setCoord(evt);
        onDrag(evt);
    }

    public void onDrag(MouseEvent evt) {
        draw(evt);
    }


}
