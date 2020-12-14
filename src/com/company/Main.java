package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("hi");
        Scanner scanner = new Scanner(System.in);
        System.out.println("vvedi kol-vo chisel:");
        int kolvo = scanner.nextInt();
        String[] num = new String[kolvo];
        System.out.println("vvedi chisla:");
        for (int i = 0; i < kolvo; i++) {
            num[i] = scanner.next();
        }
        int sred = 0;
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i].length();
            sred=sum/kolvo;
        }
        System.out.println("summa dlin= "+ sum);
        System.out.println("srednyaya dlina= "+sred);
//        System.out.println("4isla <= sredney");
        for (int o = 0; o < num.length; o++) {
            if (num[o].length()>=sred)
            System.out.println(num[o]+" ---- 4islo >= sredney   "+num[o].length()+" symb");
            else System.out.println(num[o]+" ---- 4islo < sredney"+num[o].length()+" symb");
        }
    }
}
