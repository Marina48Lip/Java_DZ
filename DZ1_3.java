//Реализовать простой калькулятор (+ - / *)



import java.util.Scanner;
public class DZ1_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число a ");
        Integer a = iScanner.nextInt();
        System.out.print("Введите знак ");
        String z = iScanner.next();
        System.out.print("Введите число b ");
        Integer b = iScanner.nextInt();
        iScanner.close();
        if (z.equals("+")) {
            System.out.printf("%s %s %s = %s", a, z, b, a + b );
        }
        if (z.equals("-")) {
            System.out.printf("%s %s %s = %s", a, z, b, a - b );
        }
        if (z.equals("*")) {
            System.out.printf("%s %s %s = %s", a, z, b, a * b );
        }
        if (z.equals("/")) {
            System.out.printf("%s %s %s = %s", a, z, b, a / b );
        }
     }

}