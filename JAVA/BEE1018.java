package Q_1018;

import java.util.Scanner;
public class Q_1018 {
    public static void main(String[] args) {
        int num;
        int n100=0, n50=0, n20=0, n10=0, n5=0, n2=0, n1=0;

        Scanner ler = new Scanner(System.in);

        num = ler.nextInt();
        System.out.println(num);
        if(num > 0){
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
                } else if (num >= 5 && num < 10){
                    num -= 5;
                    n5++;
                } else if (num >= 2 && num < 5){
                    num -= 2;
                    n2++;
                } else if (num >= 1 && num < 2) {
                    num -= 1;
                    n1++;
                }
            }
        }
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");
    }
}
