package com.kodilla.testing.shape;

class Square implements Shape {
    private int a;
    private String name;

    public Square(int a, String name) {
        this.a = a;
        this.name = name;
    }
    public String getShapeName() {
        return name;
    }
    public double getField() {
        return a*a;
    }
    public String toString() {
        return getShapeName() + " has field = " + getField();
    }
}
