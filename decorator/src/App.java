import com.home.gui.Window;
import com.home.shape.ColorShape;
import com.home.shape.DashLineShape;
import com.home.shape.Shape;
import com.home.shape.Square;

import java.awt.*;

public class App {

    public static void main(String[] args) {

        Window w = new Window("Shapes", 300, 300);
        w.show();

        Shape shape = new DashLineShape(new ColorShape(new Square(), Color.YELLOW));

        w.drawShape(shape);
    }
}
