import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        questao1();
        questao2();
        //questao 3 e 4 estão em texto na resposta
        questao5();

    }
    private static void questao1() {
        System.out.println("\nQUESTÃO 1");

        int indice = 13, soma = 0, K = 0;

        while (K < indice){
            K = K + 1;
            soma = soma + K;
        }
        System.out.println("Soma = " + soma);
    }
    private static void questao2() {
        System.out.println("\nQUESTÃO 2");

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt(), valorAtual = 0, valorAnterior = 1, soma = 0;
        boolean pertence = false;

        while (soma <= numero) {
            if (soma == numero) {
                pertence = true;
                break;
            }
            valorAtual = valorAnterior;
            valorAnterior = soma;
            soma = valorAtual + valorAnterior;
        }
        if (pertence) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

    private static void questao5() {
        System.out.println("\nQUESTÃO 5");
        int i;
        String original = "Target Sistemas";
        char[] arr = original.toCharArray();
        int tamanho = arr.length;

        for (i = 0; i < tamanho / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[tamanho - 1 - i];
            arr[tamanho - 1 - i] = temp;
        }
        System.out.println(new String(arr));
    }
}