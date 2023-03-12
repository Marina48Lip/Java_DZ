// Напишите метод, который принимает на вход строку (String) и 
// определяет является ли строка палиндромом (возвращает boolean значение). Без встр. функций

import java.util.Scanner;

public class DZ2_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите строку ");
        String stroka = iScanner.next();   
        iScanner.close();
        boolean polindrom = false;
    
        if (stroka.equals(reverse(stroka))){
            polindrom = true;
            System.out.println("Строка является палиндромом");
            System.out.println(polindrom);
        }
        else{
            System.out.println("Строка НЕ является палиндромом");
            System.out.println(polindrom);
        }
        }
        public static String reverse(String stroka) {
            char[] array = stroka.toCharArray();
            String stroka2 = "";
            for (int i = array.length - 1; i >= 0; i--) {
               stroka2 = stroka2 + array[i];
            }
            return stroka2;
          }
    }
