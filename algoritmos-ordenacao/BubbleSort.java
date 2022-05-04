public class BubbleSort {

    public static void bubbleSort(int[] vetor) {
        int aux = 0;
        for (int i = 0; i < vetor.length - 1; i++) {
            boolean estaOrdenado = true;
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    estaOrdenado = false;
                }
            }
            if (estaOrdenado)
                break;
        }
    }

    public static void imprimir(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(" " + vetor[i]);
        }
    }

    public static void main(String args[]) {
        int[] vet = { 1, 5, 8, 9, 2 };

        System.out.println("Vetor desordenado: ");
        imprimir(vet);
        System.out.println(" ");
        bubbleSort(vet);
        System.out.println("Vetor organizado:");
        imprimir(vet);
    }
}
