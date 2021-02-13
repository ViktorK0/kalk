package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final double number1 =getNumber();
        final double number2 =getNumber();
        final String diy =vvedenyaDiy();

        diya(number1, number2, diy);
    }

    public static double getNumber() {
        Scanner vidkorustuvacha = new Scanner(System.in);
        System.out.println("Vvedit chuslo: ");
        return Double.parseDouble(vidkorustuvacha.nextLine());
    }

    public static String vvedenyaDiy() {
        Scanner vidkorustuvacha = new Scanner(System.in);
        System.out.println("Vvedit diy(+,-,*,/,): ");
        return vidkorustuvacha.nextLine();
    }

    private static void eror(String diy, double number) {
        if (diy.equals("/") && number == 0) {
            System.out.println("ne korecktno");
        }
    }

    /**
     * цей метод вираховує результат
     *
     * @param chuslo2
     * @param chuslo1
     * @param diya
     * @return
     */
    public static int diya(Double chuslo1, Double chuslo2, String diya) {
        eror(diya, chuslo2);
        double rezultat;
        if (diya.equals("+") || diya.equals("dodavannya")) {
            rezultat = chuslo1 + chuslo2;
        } else if (diya.equals("-") || diya.equals("vidnimannya")) {
            rezultat = chuslo1 - chuslo2;
        } else if (diya.equals("*") || diya.equals("mnogennya")) {
            rezultat = chuslo1 * chuslo2;
        } else if (diya.equals("/") || diya.equals("dilennya")) {
            rezultat = chuslo1 / chuslo2;
        } else {
            rezultat = 0D;
        }
        System.out.println("Vash rezultat : " + rezultat);
        return (int) Math.round(rezultat);
    }
}








