package Q_1063;

import java.util.Scanner;
import java.util.Stack;

public class Q_1063{
    public static void main(String[] args) {
        int num = -1, i, j;
        String[] entrada;
        String[] saida;
        Stack<String> pilha = new Stack<>();
        Scanner ler = new Scanner(System.in);

        while(num != 0){
            num = ler.nextInt();
            entrada = new String[num];
            saida = new String[num];

            for(i = 0; i < num; i++) entrada[i] = ler.next();
            for (i = 0; i < num; i++) saida[i] = ler.next();

            i = 0;
            j = 0;
            while(true){
                if(!pilha.empty() && j < num && pilha.peek().equals(saida[j])){
                    pilha.pop();
                    System.out.print("R");
                    j++;
                }else if(i < num){
                    pilha.push(entrada[i]);
                    System.out.print("I");
                    i++;
                }else{
                    break;
                }
            }
            if(pilha.empty()) System.out.print("\n");
            else if(!pilha.empty()) System.out.println(" Impossiblen");
            while (!pilha.empty()){
                pilha.pop();
            }
        }
    }
}