package com.kodilla.testing.shape;


class Triangle implements Shape{
    private int a;
    private int h;
    private String name;

    public Triangle(int a, int h, String name) {
        this.a = a;
        this.h = h;
        this.name = name;
    }
    public int getA() {
        return a;
    }
    public int getH() {
        return h;
    }
    public String getShapeName() {
        return name;
    }
    public double getField() {
        return (a*h)/2;
    }
    public String toString() {
        return getShapeName() + " has field = " + getField();
    }
}
