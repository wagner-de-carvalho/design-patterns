package com.home.factorymethod;

import com.home.Shape;

import java.awt.Graphics;

public class Circle extends Shape {

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillOval(0, 0, 50, 50);
    }
}
