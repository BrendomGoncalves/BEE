import java.io.IOException;
import java.util.Scanner;

class BEE1162{
    static int[] trem;

    static int busca(int tamanho, int proxIndice){
        for(int i=0; i<tamanho; ++i){
            if(trem[i] == proxIndice) return i;
        }
        return -1;
    }

    static void troca(int x, int y){
        int tmp = trem[x];
        trem[x] = trem[y];
        trem[y] = tmp;
    }

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
        int testes, tamanhoTrem, contUm, contDois, tmp;

        testes = read.nextInt();

        while(testes>0){
            tamanhoTrem = read.nextInt();

            trem = new int[tamanhoTrem];
            for(int j=0; j<tamanhoTrem; j++){
                trem[j] = Integer.parseInt(read.next());
            }
            contUm=0;
            contDois=0;
            while(contUm<tamanhoTrem){
                while(trem[contUm] != (contUm + 1)){
                    tmp = busca(tamanhoTrem, contUm+1);
                    troca(tmp-1, tmp);
                    contDois++;
                }
                contUm++;
            }
            System.out.println("Optimal train swapping takes "+contDois+" swaps.");
            testes--;
        }
    }
}