package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        vvedenyaZnachennya();
        diya();

  }

    public static void vvedenyaZnachennya() {
            double chuslo1, chuslo2, rezultat;
            String diya;
            Scanner vidkorustuvacha = new Scanner(System.in);
            System.out.println("Vvedit chuslo1: ");
            chuslo1 = Double.parseDouble(vidkorustuvacha.nextLine());
            System.out.println("Vvedit chuslo2: ");
            chuslo2 = Double.parseDouble(vidkorustuvacha.nextLine());
            System.out.println("Vvedit diy(+,-,*,/,): ");
            diya = vidkorustuvacha.nextLine();
        }
    private static void eror() {
            if (diya.equals("/") && chuslo2 == 0) {
            System.out.println("ne korecktno");
            return;
            }
    }

    /**
     * цей метод вираховує результат
     * @param chuslo2
     * @param chuslo1
     * @param rezultat
     * @param diya
     * @return
     */
        public static int diya(String chuslo2, String chuslo1, String rezultat, String diya){
         eror();
        if (diya.equals("+")||diya.equals("dodavannya")) {
            rezultat = chuslo1 + chuslo2;
        }
            else if (diya.equals("-")||diya.equals("vidnimannya")){
                rezultat=chuslo1-chuslo2;
            }
                else if (diya.equals("*")||diya.equals("mnogennya")) {
                    rezultat = chuslo1 * chuslo2;
                }
                    else if (diya.equals("/")||diya.equals("dilennya")){
                        rezultat=chuslo1/chuslo2;
                    }
                        else{ rezultat=0;
                        }
        System.out.println("Vash rezultat : " + rezultat);
                        }
                    }








