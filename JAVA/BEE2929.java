package Q_2929;

import java.util.Scanner;
import java.util.Vector;

public class Q_2929{
    public static void main(String[] args) {
        int entradas, cont = 0;
        String entradaLinha;
        Scanner ler = new Scanner(System.in);
        Vector<Integer> vetor = new Vector<>(0);

        entradas = ler.nextInt();

        while(cont++ <= entradas){
            entradaLinha = ler.nextLine();

            String[] auxVet = entradaLinha.split(" ");

            if(auxVet[0].equalsIgnoreCase("push")){
                vetor.addElement(Integer.parseInt(auxVet[1]));
            } else if(auxVet[0].equalsIgnoreCase("pop")){
                if(!vetor.isEmpty()){
                    vetor.removeElementAt(vetor.size() - 1);
                } else System.out.println("EMPTY");
            } else if(auxVet[0].equalsIgnoreCase("min")) {
                if(!vetor.isEmpty()){
                    int menor = vetor.elementAt(0);
                    for (int i : vetor) {
                        if (i < menor) menor = i;
                    }
                    System.out.println(menor);
                } else System.out.println("EMPTY");
            }
        }
    }
}