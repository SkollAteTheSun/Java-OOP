package ru.bstu.it32.nasypalov.lab3;

import java.util.Comparator;
import java.util.Scanner;

public class GasOven extends HouseholdTechnic {

    private int burner;
    private int volume;

    public GasOven() {
        super();
    }

    public void setBurner(int burner) {
        this.burner = burner;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void init(Scanner sc) {
        // Ввод цены
        super.init(sc);
        //System.out.println("Введите цену газовой плиты:");
        //setCost(sc.nextDouble());
        System.out.println("Введите кол-во горелок (шт):");
        setBurner(sc.nextInt());
        System.out.println("Введите объем духового шкафа (л):");
        setVolume(sc.nextInt());
    }

    @Override
    public String toString() {
        String str = super.toString();
        return "\nГазовая плита \n\t" +
                " - Кол-во горелок: " + burner +
                " шт \n\t - Объем духового шкафа: " + volume +
                " л " + str;
    }


}


