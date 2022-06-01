package com.classes;

import java.io.Serializable;

public class Parallelepiped extends Rectangle implements Serializable {
    private double height;

    public Parallelepiped(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public void setParallelepipedHeight(double height) {
        this.height = height;
    }

    public double getParallelepipedHeight() {
        return this.height;
    }

    public void setParallelepipedWidth(double width) {
        super.width = width;
    }

    public double getParallelepipedWidth() {
        return super.width;
    }

    public void setParallelepipedLength(double length) {
        super.length = length;
    }

    public double getParallelepipedLength() {
        return super.length;
    }

    public double getParallelepipedDiagonal() {
        return Math.sqrt(super.getRectangleDiagonal() * super.getRectangleDiagonal() + this.height * this.height);
    }

    public double getParallelepipedArea() {
        return super.getRectangleArea();
    }

    public double getParallelepipedVolume() {
        return super.getRectangleArea() * this.height;
    }

    @Override
    public String toString() {
        return "height = " + Untiled.formatDouble(this.height) +
                "\nlength = " + Untiled.formatDouble(super.length) +
                "\nwidth = " + Untiled.formatDouble(super.width) +
                "\ndiagonal = " + Untiled.formatDouble(this.getParallelepipedDiagonal()) +
                "\nperimeter = " + Untiled.formatDouble(super.getRectanglePerimeter()) +
                "\narea = " + Untiled.formatDouble(super.getRectangleArea()) +
                "\nvolume = " + Untiled.formatDouble(getParallelepipedVolume());
    }
}
