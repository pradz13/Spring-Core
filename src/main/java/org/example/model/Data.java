package org.example.model;

public class Data {
    private int element;

    public Data(int element) {
        this.element = element;
    }

    public int getElement() {
        return element;
    }

    @Override
    public String toString() {
        return "Data{" +
                "element=" + element +
                '}';
    }
}
