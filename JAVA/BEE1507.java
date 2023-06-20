package Q_1507;
import java.util.Scanner;
public class Q_1507{
    public static boolean eValido(String a, String b){
        int i, j;
        int tamanho1, tamanho2;

        tamanho1 = a.length();
        tamanho2 = b.length();

        for(i=0, j=0; i < tamanho2 && j < tamanho1; i++){
            if(a.indexOf(j) == b.indexOf(i)){
                j++;
            }
        }
        return j == tamanho1;
    }
    public static void main(String[] args) {
        String texto;
        String outroTexto;
        int casos, strings;
        Scanner ler = new Scanner(System.in);

        casos = ler.nextInt();
        texto = ler.next();

        for(int i=0; i<casos; i++){
            strings = ler.nextInt();
            for(int j=0; j<strings; j++){
                outroTexto = ler.nextLine();
                if(eValido(outroTexto, texto)){
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
            texto = ler.nextLine();
        }
    }
}