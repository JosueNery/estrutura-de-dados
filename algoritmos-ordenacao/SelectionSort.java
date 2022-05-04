public class SelectionSort {
    public static void selectionSort(int vetor[]) {
        int size = vetor.length;

        for (int step = 0; step < size - 1; step++) {
            int min_idx = step;

            for (int i = step + 1; i < size; i++) {

                if (vetor[i] < vetor[min_idx]) {
                    min_idx = i;
                }
            }

            int temp = vetor[step];
            vetor[step] = vetor[min_idx];
            vetor[min_idx] = temp;
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
        selectionSort(vet);
        System.out.println("Vetor organizado:");
        imprimir(vet);
    }
}
