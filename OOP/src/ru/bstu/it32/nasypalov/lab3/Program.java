package ru.bstu.it32.nasypalov.lab3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Program {
    public static void main(String[] args) {
        ArrayList<HouseholdTechnic> tech = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int switcher;
        System.out.println("Введите кол-во техники:");
        String line = sc.nextLine();
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(line);
        if (m.find())
            n = Integer.parseInt(line.substring(m.start(),m.end()));
        else
        {
            System.out.println("Ошибка ввода");
            System.exit(0);
        }
        System.out.println("Кол-во техники = " + n);
        for (int i = 0; i < n; i++) {
            System.out.println("Введите тип техники:\n" +
                    "1 - Газовая плита\n" +
                    "2 - Микроволновка\n" +
                    "3 - Стиральная машина\n");
            switcher = sc.nextInt();
            switch (switcher) {
                case 1: {
                    GasOven go = new GasOven();
                    go.init(sc);
                    tech.add(go);
                    break;
                }
                case 2: {
                    Microwave mw = new Microwave();
                    mw.init(sc);
                    tech.add(mw);
                    break;
                }
                case 3: {
                    WashMachine wm = new WashMachine();
                    wm.init(sc);
                    tech.add(wm);
                    break;
                }
            }
        }
        
        tech.sort((o1, o2) -> {
            return Double.compare(o2.getCost(), o1.getCost());
        });

        System.out.println(tech.get(0).toString());
    }
}
