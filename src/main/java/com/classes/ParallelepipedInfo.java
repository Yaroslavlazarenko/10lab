package com.classes;

public class ParallelepipedInfo {
    private double length;
    private double width;
    private double height;
    private double diagonal;
    private double area;
    private double volume;

    public ParallelepipedInfo() {
    }

    public ParallelepipedInfo(double length, double width, double height, double diagonal, double area, double volume) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.diagonal = diagonal;
        this.area = area;
        this.volume = volume;
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

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
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

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }
}
