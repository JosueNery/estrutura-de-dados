import java.util.Random;

public class Multiplicacao {
    public static int multi(int x, int y) {
        if (y <= 0) {
            return 0;
        } else {
            x = x + multi(x, y - 1);
        }
        return x;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int max = 10, x, y;

        x = Math.abs(random.nextInt() % max);
        y = Math.abs(random.nextInt() % max);

        System.out.println(x + " " + y + " " + multi(x, y));
    }

}
