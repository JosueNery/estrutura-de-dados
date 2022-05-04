import java.util.Random;

public class VetorInvertido {
    public static int[] inverterElementos(int[] vetor, int posicaoFinal, int posicaoInicial) {
        int aux;
        if (posicaoInicial >= posicaoFinal) {
            return vetor;
        } else {
            aux = vetor[posicaoInicial];
            vetor[posicaoInicial] = vetor[posicaoFinal];
            vetor[posicaoFinal] = aux;
            return inverterElementos(vetor, posicaoFinal - 1, posicaoInicial + 1);
        }
    }

    public static void imprimirVetorInt(int[] vetor, int tamanho) {
        if (tamanho == 1) {
            System.out.print("\n" + vetor[tamanho - 1]);
        } else {
            imprimirVetorInt(vetor, tamanho - 1);
            System.out.print(" " + vetor[tamanho - 1]);
        }
    }

    public static void main(String[] args) {
        int max = 10;
        int a[] = new int[max];
        Random random = new Random();

        for (int i = 0; i < max; i++) {
            a[i] = Math.abs(random.nextInt() % max);
        }

        imprimirVetorInt(a, max);

        inverterElementos(a, max - 1, 0);

        imprimirVetorInt(a, max);
    }

}
