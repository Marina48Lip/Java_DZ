//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

import java.util.ArrayList;
import java.util.Random;

public class DZ3_3 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i= 0; i<20; i ++){
            list.add(rnd.nextInt(0, 100)); 
        }
        System.out.println(list);
        int max = getMax(list);
        int min = getMin(list);
        int avr = getAvr(list);

        System.out.println("Максимальный элемент = " + max);
        System.out.println("Минимальный элемент = " + min);
        System.out.println("Среднее арифмитическое = " + avr);
    }

    public static int getMax(ArrayList<Integer> inputArray){ 
        int maxValue = inputArray.get(0); 
        for(int i=1;i < inputArray.size() ;i++){ if(inputArray.get(i) > maxValue){ 
             maxValue = inputArray.get(i); 
          } 
        } 
        return maxValue; 
      }

      public static int getMin(ArrayList<Integer> inputArray){ 
        int minValue = inputArray.get(0); 
        for(int i=1;i < inputArray.size() ;i++){ if(inputArray.get(i) < minValue){ 
             minValue = inputArray.get(i); 
          } 
        } 
        return minValue; 
      }

      public static int getAvr(ArrayList<Integer> inputArray){ 
        int summ = 0;
        int Avr = 0;
        for(int i=1;i < inputArray.size() ;i++){
            summ = summ + inputArray.get(i);
          }  
        Avr = summ / inputArray.size(); 
        return Avr; 
      }
      
}