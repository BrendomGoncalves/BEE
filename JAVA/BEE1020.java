package Q_1020;

import java.util.Scanner;
public class Q_1020 {
    public static void main(String[] args) {
        int num;
        int nAno=0, nMes=0, nDia=0;
        Scanner ler = new Scanner(System.in);
        num = ler.nextInt();
        if(num > 0){
            while(num > 0){
                if(num >= 365){
                    num -= 365;
                    nAno++;
                } else if(num >= 30 && num < 365){
                    num -= 30;
                    nMes++;
                } else if (num >= 1 && num < 30) {
                    num -= 1;
                    nDia++;
                }
            }
        }
        System.out.println(nAno + " ano(s)");
        System.out.println(nMes + " mes(es)");
        System.out.println(nDia + " dia(s)");
    }
}
