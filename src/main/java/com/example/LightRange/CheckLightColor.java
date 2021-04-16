package com.example.LightRange;
import java.util.Scanner;
public class CheckLightColor {
    public CheckLightColor(float l) {
        if (l >= 380 && l < 450) {
            System.out.println("Фиолетовый свет");
        } else if (l >= 450 && l < 480) {
            System.out.println("Синий свет");
        } else if (l >= 480 && l < 510) {
            System.out.println("Голубой свет");
        } else if (l >= 510 && l < 550) {
            System.out.println("Зеленый свет");
        } else if (l >= 550 && l < 570) {
            System.out.println("Салатовый свет");
        } else if (l >= 570 && l < 590) {
            System.out.println("Желтый свет");
        } else if (l >= 590 && l < 630) {
            System.out.println("Оранжевый свет");
        } else if (l >= 630 && l < 780) {
            System.out.println("Красный свет");
        } else {
            System.out.println("Диапазон невидимого света");
        }
    }
}
