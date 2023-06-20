package Q_1069;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Q_1069{
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        LinkedList<String> lista = new LinkedList<>();
        int qnt, abre, fecha;

        qnt = ler.nextInt();
        for(int i=0;i<qnt;i++){
            lista.add(ler.next());
        }
        for(int i=0;i<qnt;i++){
            abre = 0;
            fecha = 0;
            String[] vetCarac = lista.get(i).split("");

            for(String j : vetCarac){
                if(j.equals("<")) abre++;
                if(j.equals(">")) fecha++;
            }
            if(abre == fecha){
                System.out.println(abre);
            } else System.out.println(Math.min(abre, fecha));
        }
    }
}