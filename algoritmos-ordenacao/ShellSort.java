public class ShellSort {
    public static void shellSort(int array[], int n) {
        for (int interval = n / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < n; i += 1) {
                int temp = array[i];
                int j;
                for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
                    array[j] = array[j - interval];
                }
                array[j] = temp;
            }
        }
    }

    public static void imprimir(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }

    public static void main(String args[]) {
        int[] vet = { 1, 5, 8, 9, 2 };
        int size = vet.length;

        System.out.println("Vetor desordenado: ");
        imprimir(vet);
        System.out.println(" ");
        shellSort(vet, size);
        System.out.println("Vetor organizado:");
        imprimir(vet);
    }
}
