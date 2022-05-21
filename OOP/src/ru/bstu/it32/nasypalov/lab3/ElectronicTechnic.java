package ru.bstu.it32.nasypalov.lab3;

public abstract class ElectronicTechnic extends HouseholdTechnic {

    protected int height;
    protected int width;

    public ElectronicTechnic() {
        super();
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
