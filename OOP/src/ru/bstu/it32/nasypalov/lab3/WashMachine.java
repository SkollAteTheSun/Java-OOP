package ru.bstu.it32.nasypalov.lab3;

import java.util.Scanner;

public class WashMachine extends ElectronicTechnic {
    private int levels;
    private int volume;

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public WashMachine() {
        super();
    }



    @Override
    public void init(Scanner sc) {
        //System.out.println("Введите цену стиральной машины:");
        //setCost(sc.nextDouble());
        super.init(sc);

        System.out.println("Введите ширину(см):");
        setWidth(sc.nextInt());

        System.out.println("Введите высоту(см):");
        setHeight(sc.nextInt());

        System.out.println("Введите кол-во программ(шт):");
        setLevels(sc.nextInt());

        System.out.println("Введите объем стиральной машины(кг):");
        setVolume(sc.nextInt());
    }

    @Override
    public String toString() {
        String str = super.toString();
        return "\nСтиральная машина \n\t" +
                " - Кол-во программ = " + levels +
                "шт \n\t - Объем = " + volume +
                "л \n\t - Высота = " + height +
                "см \n\t - Ширина = " + width +
                "см " + str;
    }
}

