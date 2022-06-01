package com.classes;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ParallelepipedsDatabase implements Serializable {
    private final List<Parallelepiped> parallelepipedsList;

    public ParallelepipedsDatabase() {
        parallelepipedsList = new ArrayList<>();
    }

    public boolean add(Parallelepiped parallelepiped) {
        return parallelepipedsList.add(parallelepiped);
    }

    public Parallelepiped getParallelepipedFromList(int index) {
        return parallelepipedsList.get(index);
    }

    public List<Parallelepiped> getParallelepipedList() {
        return parallelepipedsList;
    }

    public int getCountOfCubes() {
        int countOfCubes = 0;
        for (Parallelepiped parallelepiped : parallelepipedsList) {
            if ((parallelepiped.getParallelepipedHeight() == parallelepiped.getParallelepipedWidth()) &&
                    (parallelepiped.getParallelepipedWidth() == parallelepiped.getParallelepipedLength()))
                countOfCubes++;
        }
        return countOfCubes;
    }

    public void clear() {
        this.parallelepipedsList.clear();
    }

    @Override
    public String toString() {
        return "count of cubes -> " + getCountOfCubes() +
                "\n\n\n";
    }
}

