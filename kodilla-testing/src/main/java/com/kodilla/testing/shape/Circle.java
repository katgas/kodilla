package com.kodilla.testing.shape;

class Circle implements Shape {
    private double r;
    private String name;

    public Circle(double r, String name) {
        this.r = r;
        this.name = name;
    }
    public double getR() {
        return r;
    }
    public String getShapeName() {
        return name;
    }
    public double getField() {
        return r*r*3.14;
    }
    public String toString() {
        return getShapeName() + " has field = " + getField();
    }
}
