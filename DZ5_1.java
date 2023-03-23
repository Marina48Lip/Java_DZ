// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
// Добавить функции 
// 1) Добавление номера
// 2) Вывод всего

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class DZ5_1 {

    public static HashMap<String, List<String>> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        while(true){
            System.out.print("1) Добавление номера " + "\n");
            System.out.print("2) Вывод всего " + "\n"11);
            Scanner iScanner = new Scanner(System.in);
            int input = iScanner.nextInt();
            if (input == 1) {
                addInPhoneBook();
            }
            if (input == 2){
                System.out.println(phoneBook);
            } 
        }  
    }

    public static void addInPhoneBook() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите имя ");
        String name = iScanner.nextLine();
        System.out.print("Телефон ");
        String phone = iScanner.nextLine();
        if (phoneBook.containsKey(name)){
            phoneBook.get(name).add(phone);
        }   else {
            ArrayList<String> list = new ArrayList<>();
            list.add(phone);
            phoneBook.put(name, list);
        }
    }
}
    

