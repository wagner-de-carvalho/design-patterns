package com.home.factorymethod;

import com.home.Shape;

public class App {
    public static void main(String[] args) {
        Window w = new Window("Shapes", 300, 300);
        w.show();

        Shape shape = ShapeFactory.newShape();

        w.drawShape(shape);
    }
}
