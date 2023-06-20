import java.io.IOException;
import java.util.Scanner;

public class BEE1086 {
    public static void ordenaVetor(int[] vetor){
        int i, j, aux;
        for (j = 1; j < vetor.length; j++){
            aux = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > aux); i--){
                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = aux;
        }
    }
    public static int medeSalao(int[] tabuas, int lin, int col, int quantidadeT){
        int qTabuasLinhaCol = 0;
        int tabuasCorretas = 0;
        for(int i=1; i<=lin;i++){
            if((col - tabuas[quantidadeT]) == 0){
                tabuas[quantidadeT] = 0;
                ordenaVetor(tabuas);
                qTabuasLinhaCol++;
                tabuasCorretas++;
            } else {
                int result = col;
                int index = quantidadeT - 1;
                do{
                    if((result - tabuas[index]) == 0){
                        tabuas[index] = 0;
                        ordenaVetor(tabuas);
                        qTabuasLinhaCol++;
                        result = 0;
                        tabuasCorretas++;
                    } else {
                        for(int j=0; j<index; j++){
                            if((result - (tabuas[index] + tabuas[j])) == 0){
                                tabuas[index] = 0;
                                ordenaVetor(tabuas);
                                qTabuasLinhaCol += 2;
                                result = 0;
                                tabuasCorretas++;
                                break;
                            }
                        }
                    }
                    index--;
                }while(result != 0 && index > 0);
            }
        }
        if(tabuasCorretas == lin) return qTabuasLinhaCol;
        else{
            System.out.println("impossivel");
            return 0;
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        int linhas, colunas, larguraT, quantidadeT;

        do{
            linhas = Integer.parseInt(read.next());
            colunas = Integer.parseInt(read.next());
            if (linhas != 0 && colunas != 0){
                larguraT = read.nextInt();
                quantidadeT = read.nextInt();

                int[] comprimentosT = new int[quantidadeT];
                for (int i = 0; i < quantidadeT; i++){
                    comprimentosT[i] = Integer.parseInt(read.next());
                }
                if(larguraT < 100){
                    System.out.println("impossivel");
                } else {
                    int colunalinha, linhacoluna;
                    linhacoluna = medeSalao(comprimentosT, linhas, colunas, quantidadeT - 1);
                    colunalinha = medeSalao(comprimentosT, colunas, linhas, quantidadeT - 1);
                    if(linhacoluna > 0 && colunalinha > 0) System.out.println(Math.min(linhacoluna, colunalinha));
                }
            }
        }while(linhas != 0 && colunas != 0);
    }
}