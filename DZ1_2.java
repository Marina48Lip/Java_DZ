//  Вывести все простые числа от 1 до 1000


public class DZ1_2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 1000; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i % j) == 0 ) {
                    count ++;
                } 
            }
            if (count == 2){
                System.out.print(i + " ");
                count = 0;
            } else {
                count = 0;
            }
        }
    }
}