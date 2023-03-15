//Пусть дан произвольный список целых чисел, удалить из него чётные числа

import java.util.Random;
import java.util.ArrayList;

public class DZ3_2 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i= 0; i<20; i ++){
            list.add(rnd.nextInt(0, 20)); 
        }
        System.out.println(list);
        int i = 0;
        while (i < list.size())
        {
          if (list.get(i) % 2 == 0)
        {
            list.remove(i);
            i --;
        }
            i++;
        }
        System.out.println(list);
    }
}
