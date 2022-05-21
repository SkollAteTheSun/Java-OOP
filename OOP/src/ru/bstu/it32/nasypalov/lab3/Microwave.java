package ru.bstu.it32.nasypalov.lab3;

import java.util.Scanner;

public class Microwave extends ElectronicTechnic {
    private int power;
    private int powerLevel;

    public Microwave() {
        super();
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    @Override
    public void init(Scanner sc) {

        //System.out.println("Введите цену микроволновки:");
        //setCost(sc.nextDouble());
        super.init(sc);

        System.out.println("Введите ширину(см):");
        setWidth(sc.nextInt());

        System.out.println("Введите высоту(см):");
        setHeight(sc.nextInt());

        System.out.println("Введите мощность(вт):");
        setPower(sc.nextInt());

        System.out.println("Введите кол-во уровней мощности(шт):");
        setPowerLevel(sc.nextInt());
    }

    @Override
    public String toString() {
        String str = super.toString();
        return "\nМикроволновка \n\t" +
                " - Мощность: " + power +
                " вт \n\t - Количество уровней мощности = " + powerLevel +
                " \n\t - Высота = " + height +
                " см \n\t - Ширина = " + width +
                " см " +str ;
    }
}
