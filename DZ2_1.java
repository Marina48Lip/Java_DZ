// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

// Дана строка (получение через обычный текстовый файл!!!)

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
    
public class DZ2_1 {
    public static void main(String[] args) {
        int [] arr = {3, 9, 1, 4, 2, 8};
        int temp;
        boolean sort = false;
        String file_name = "1.txt";
        File file = new File(file_name);
        try {
        FileWriter writer = new FileWriter(file, false);
        while (!sort) {
            sort = true;
            for (int i = 0; i < arr.length - 1; i++){
              if (arr[i] > arr [i + 1]){
                sort = false;
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                writer.write(Arrays.toString(arr));
                writer.write("\n");
                }
            }          
         }
        writer.close();
        }
        catch (Exception e){
            System.out.println("Что то пошло не так");
        }
    }
}
