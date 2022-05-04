public class InsertionSort {
    public static void insertionSort(int array[]) {
        int size = array.length;

        for (int step = 1; step < size; step++) {
            int key = array[step];
            int j = step - 1;

            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }

            array[j + 1] = key;
        }
    }

    public static void imprimir(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }

    public static void main(String args[]) {
        int[] vet = { 1, 5, 8, 9, 2 };

        System.out.println("Vetor desordenado: ");
        imprimir(vet);
        System.out.println(" ");
        insertionSort(vet);
        System.out.println("Vetor organizado:");
        imprimir(vet);
    }
}
