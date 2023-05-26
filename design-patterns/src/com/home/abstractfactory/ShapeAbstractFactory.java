package com.home.abstractfactory;

import com.home.Shape;

public abstract class ShapeAbstractFactory {

	public abstract Shape newShape(String type);
}
