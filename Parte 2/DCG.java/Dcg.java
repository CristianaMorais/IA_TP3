import java.util.Scanner;
import java.util.LinkedList;

class Dcg {

    public static void readInput() {
        Scanner in = new Scanner(System.in);
        Sentences fr = new Sentences();
        System.out.println("Intoduza uma frase em que as palavras estejam separadas por um espaco e não contenham ponto de final: ");
        System.out.println("Caso pretenda sair escreva: sair");
        String respostaFinal = in.nextLine();

        LinkedList<String> frase;
        while(!respostaFinal.equals("sair")){
            frase = fr.formaFrases(respostaFinal);
            fr.frases_NV(frase);
            fr.corrigeFrase();
            System.out.println("\nIntroduza uma nova frase: ");
            System.out.println();
            respostaFinal = in.nextLine();
        }
    }

    public static void main(String [] args){
        readInput();
    }
}