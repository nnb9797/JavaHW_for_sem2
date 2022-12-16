package org.example;

public class Calculator  implements Converter{
    @Override // переопределение метода
    public void convert_value(double gradus) {
        double far = ((gradus*9)/5)+ 32;
        double kelv = gradus + 273.15;
        System.out.println("Температура в градусах Кельвина: "+kelv);
        System.out.println("Температура в градусах Фаренгейта: "+far);
    }
}