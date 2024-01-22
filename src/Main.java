import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        double x = input.nextInt();
        System.out.print("Введите число повторений: ");
        double z = input.nextInt();
        double result = 0;
        if (Math.abs(x) > 1) {
            for (double n = 0; n < z; n++) {
                result =+ 1/((2*n+1)*Math.pow(x, 2*n+1));
            }
            System.out.println("Результат:" + result);
        }
    }
}