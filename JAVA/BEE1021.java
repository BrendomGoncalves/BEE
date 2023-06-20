package Q_1021;

import java.util.Scanner;

public class Q_1021 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double num;
        int n100=0, n50=0, n20=0, n10=0, n5=0, n2=0;
        int m1=0, m50=0, m25=0, m10=0, m05=0, m01=0;

        num = Double.parseDouble(ler.next());

        if(num >= 0){
            while(num > 0){
                if(num >= 100){
                    num -= 100;
                    n100++;
                } else if (num >= 50 && num < 100) {
                    num -= 50;
                    n50++;
                } else if (num >= 20 && num < 50) {
                    num -= 20;
                    n20++;
                } else if (num >= 10 && num < 20) {
                    num -= 10;
                    n10++;
                } else if (num >= 5 && num < 10) {
                    num -= 5;
                    n5++;
                } else if (num >= 2 && num < 5) {
                    num -= 2;
                    n2++;
                } else if(num >= 1 && num < 2){
                    num -= 1;
                    m1++;
                } else if (num >= 0.50 && num < 1) {
                    num -= 0.50;
                    m50++;
                } else if (num >= 0.25 && num < 0.50) {
                    num -= 0.25;
                    m25++;
                } else if (num >= 0.10 && num < 0.25) {
                    num -= 0.10;
                    m10++;
                } else if (num >= 0.05 && num < 0.10) {
                    num -= 0.05;
                    m05++;
                } else if (num >= 0.01 && num < 0.05) {
                    num -= 0.01;
                    m01++;
                } else {
                    num = 0;
                }
            }
        }
        System.out.println("NOTAS:");
        System.out.println(n100 + " nota(s) de R$ 100.00");
        System.out.println(n50 + " nota(s) de R$ 50.00");
        System.out.println(n20 + " nota(s) de R$ 20.00");
        System.out.println(n10 + " nota(s) de R$ 10.00");
        System.out.println(n5 + " nota(s) de R$ 5.00");
        System.out.println(n2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(m1 + " moeda(s) de R$ 1.00");
        System.out.println(m50 + " moeda(s) de R$ 0.50");
        System.out.println(m25 + " moeda(s) de R$ 0.25");
        System.out.println(m10 + " moeda(s) de R$ 0.10");
        System.out.println(m05 + " moeda(s) de R$ 0.05");
        System.out.println(m01 + " moeda(s) de R$ 0.01");
    }
}