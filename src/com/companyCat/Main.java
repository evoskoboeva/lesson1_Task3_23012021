package com.companyCat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double enter1 =0, level1 = 0;
        int YesNo=0;
        System.out.println("Введите любое число");
        enter1 = (double)scanner.nextFloat();
        System.out.println("Введите степень возведения");
        level1 = (double)scanner.nextFloat();
        //System.out.println(Math.pow(enter1,level1));
        System.out.println("Результат вычисления "+enter1+" ^ "+level1+" = "+Math.pow(enter1,level1));
        System.out.println("Извлечь корень из полученного числа? 1 - да, 0 - нет");
        YesNo = scanner.nextInt();
        if (YesNo==1){
            System.out.println("Корень из "+Math.pow(enter1,level1)+" равен "+Math.sqrt(Math.pow(enter1,level1)));
        }
        else {
            System.out.println("нет так нет)))");
        }
    }
}
