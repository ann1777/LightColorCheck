package com.example.LightRange;
import java.util.Objects;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Эта программа выводит название светового диапазона, по заданой длине волны l.\nЭта программу принимает только числовые целочисленные и дробные(с точкой) значения,\nи комманду 'Stop' для завершения работы программы.");
        System.out.println("Введите длину волны L: ");
        while(true) {
            Scanner input = new Scanner(System.in);
            String k = input.next();
            if(k.equalsIgnoreCase("Stop")){
                System.out.println("Завершение программы.");
                break;
            }
            try {
                float l = Float.parseFloat(k);
                new CheckLightColor(l);
            } catch (NumberFormatException nfe) {
                System.out.println("Вы ввели некорректные данные.");
            }
            System.out.println("Введите следующую длину волны L: ");
        }
    }
}
