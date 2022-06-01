package com.classes;

public class RectangleInfo {
    private double length;
    private double width;
    private double diagonal;
    private double area;
    private double perimeter;

    public RectangleInfo() {
    }

    public RectangleInfo(double length, double width, double diagonal, double area, double perimeter) {
        this.length = length;
        this.width = width;
        this.diagonal = diagonal;
        this.area = area;
        this.perimeter = perimeter;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
