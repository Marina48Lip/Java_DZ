// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)


import java.util.Scanner;
public class DZ1_1 {
    public static void main(String[] args) {
    int sum = 0;
    int fact = 1;
    Scanner iScanner = new Scanner(System.in);
    System.out.print("Введите число ");
    Integer n = iScanner.nextInt();
    iScanner.close();
    for (int i = 1; i <= n; i++){
        sum = sum + i;
        fact = fact * i;
    }
    System.out.printf("Треугольное число = %s \n", sum);
    System.out.printf("Факториал = %s", fact);
    }
}
