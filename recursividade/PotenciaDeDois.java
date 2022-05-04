public class PotenciaDeDois {

    public static int potenciaDois(int n) {
        int x;
        if (n <= 0) {
            x = 1;
        } else {
            x = potenciaDois(n - 1) + potenciaDois(n - 1);
        }
        return x;
    }

    public static void main(String[] args) {
        int max = 10;
        for (int i = 0; i < max + 1; i++) {
            System.out.println(potenciaDois(i));
        }
    }
}
