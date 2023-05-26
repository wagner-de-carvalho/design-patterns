package com.home.abstractfactory;

import com.home.Shape;
import com.home.factorymethod.Window;

public class App {

    public static void main(String[] args) {

        Window w = new Window("Shapes", 300, 300);
        w.show();

        ShapeAbstractFactory factory = ShapeFactoryProducer.getFactory(false);
        Shape shape = factory.newShape("circle");

        w.drawShape(shape);
    }
}
