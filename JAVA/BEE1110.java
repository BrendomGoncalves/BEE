package Q_1110;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Q_1110{
    public int[] pilha;
    public int posPilha;
    public Q_1110(int tam){
        this.posPilha = -1;
        this.pilha = new int[tam];
    }
    public boolean empty(){
        return this.posPilha == -1;
    }
    public int tamanho(){
        if(this.empty()){
            return 0;
        }
        return this.posPilha + 1;
    }
    public void push(int valor){
        if(this.posPilha < this.pilha.length - 1){
            this.pilha[++posPilha] = valor;
        }
    }
    public int pop(){
        if(empty()){
            return 0;
        }
        return this.pilha[this.posPilha--];
    }
    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        int num;
        String numeros = "";
        do{
            num = Integer.parseInt(ler.readLine());
            if(num > 0){
                numeros = numeros.concat(num + ";");
            } else {
                numeros = numeros.concat(Integer.toString(num));
            }
        }while(num != 0);
        String[] vetNumeros = numeros.split(";");
        System.out.print("Discarded cards: ");
        for (String vetNumero : vetNumeros) {
            num = Integer.parseInt(vetNumero);

            if (num != 0) {
                int tamVet = num;
                int ultimo = 0;

                int[] vetAux = new int[tamVet];

                Q_1110 pilha = new Q_1110(num);
                for (int j = num; j > 0; j--) {
                    pilha.push(j);
                }

                do {
                    if(pilha.tamanho() > 2){
                        System.out.print(pilha.pop() + ", ");
                    } else if(pilha.tamanho() == 2){
                        System.out.println(pilha.pop());
                    }
                    tamVet--;
                    if (pilha.tamanho() == 1) {
                        ultimo = pilha.pop();
                    }

                    if (!pilha.empty()) {
                        for (int j = 0; j < tamVet; j++) {
                            vetAux[j] = pilha.pop();
                        }
                        pilha.push(vetAux[0]);
                        for (int j = tamVet - 1; j >= 1; j--) {
                            pilha.push(vetAux[j]);
                        }
                    }
                } while (!pilha.empty());
                System.out.println("Remaining card: " + ultimo);
            }
        }
    }
}