package com.classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RectanglesDatabase implements Serializable {
    private final List<Rectangle> rectanglesList;

    public RectanglesDatabase() {
        rectanglesList = new ArrayList<>();
    }

    public boolean add(Rectangle rectangle) {
        return rectanglesList.add(rectangle);
    }

    public Rectangle getRectangleFromList(int index) {
        return rectanglesList.get(index);
    }

    public List<Rectangle> getRectangleList() {
        return rectanglesList;
    }

    public int getRectanglesMoreAverageArea() {
        int count = 0;
        double AverageArea = 0;
        for (Rectangle value : rectanglesList)
            AverageArea += value.getRectangleArea();
        AverageArea /= rectanglesList.size();
        for (Rectangle rectangle : rectanglesList)
            if (rectangle.getRectangleArea() > AverageArea)
                count++;
        return count;
    }

    public void clear() {
        this.rectanglesList.clear();
    }

    @Override
    public String toString() {
        return "Rectangles more average area -> " + getRectanglesMoreAverageArea() +
                "\n\n";
    }
}
