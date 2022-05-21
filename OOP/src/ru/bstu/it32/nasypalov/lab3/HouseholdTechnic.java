package ru.bstu.it32.nasypalov.lab3;

import java.util.Comparator;
import java.util.Scanner;

public abstract class HouseholdTechnic {

    protected double cost;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    protected void init(Scanner sc) {
            System.out.println("Введите цену: ");
            setCost(sc.nextInt());
        }

    @Override
    public String toString() {
        return ("\n\t - Стоимость: " + cost );
    }
}



