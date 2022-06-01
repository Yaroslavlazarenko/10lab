package com.classes;

import java.io.Serializable;

public class Rectangle implements Serializable {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setRectangleLength(double length) {
        this.length = length;
    }

    public double getRectangleLength() {
        return this.length;
    }

    public void setRectangleWidth(double width) {
        this.width = width;
    }

    public double getRectangleWidth() {
        return this.width;
    }

    public double getRectangleDiagonal() {
        return Math.sqrt(this.length * this.length + this.width * this.width);
    }

    public double getRectanglePerimeter() {
        return this.length * 2 + this.width * 2;
    }

    public double getRectangleArea() {
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return "\nlength = " + Untiled.formatDouble(this.length) +
                "\nwidth = " + Untiled.formatDouble(this.width) +
                "\ndiagonal = " + Untiled.formatDouble(this.getRectangleDiagonal()) +
                "\nperimeter = " + Untiled.formatDouble(this.getRectanglePerimeter()) +
                "\narea = " + Untiled.formatDouble(this.getRectangleArea());

    }
}
