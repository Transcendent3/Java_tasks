
/**
 * Task#1
 */
// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение
// чисел от 1 до n)
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factor(n));
    }

    static int factor(int n) {
        if (n == 1)
            return 1;
        return n * factor(n - 1);
    }
}