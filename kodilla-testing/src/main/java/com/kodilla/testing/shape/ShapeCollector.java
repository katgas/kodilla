package com.kodilla.testing.shape;
import java.util.*;

public class ShapeCollector {
    ArrayList<Shape> figures = new ArrayList<>();

    public boolean addFigure(Shape shape) {
        figures.add(shape);
        return false;
    }
    public boolean removeFigure(Shape shape) {
        return figures.remove(shape);
    }
    public Shape getFigure(int n) {
        return figures.get(n);
    }
    public ArrayList<Shape> getShapes() {
        return figures;
    }
}
