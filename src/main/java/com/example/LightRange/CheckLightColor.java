package com.example.LightRange;
public class CheckLightColor {
    public CheckLightColor(float l) {
        if (l >= 380 && l < 780) {
            if (l < 450) {
                System.out.println("Фиолетовый свет");
            } else if (l < 480) {
                System.out.println("Синий свет");
            } else if (l < 510) {
                System.out.println("Голубой свет");
            } else if (l < 550) {
                System.out.println("Зеленый свет");
            } else if (l < 570) {
                System.out.println("Салатовый свет");
            } else if (l < 590) {
                System.out.println("Желтый свет");
            } else if (l < 630) {
                System.out.println("Оранжевый свет");
            } else {
                System.out.println("Красный свет");
            }
        } else {
            System.out.println("Диапазон невидимого света");
        }
    }
}