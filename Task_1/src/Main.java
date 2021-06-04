package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner (System.in);
        int i;
        i = num.nextInt();
        if (i > 7) {

            System.out.print("Привет");
        } else if  (i <= 7) {
            System.out.print ("Введите число больше 7.");
        }
    }
}
