import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook(8, 500, "win", "черный");
        Notebook notebook2 = new Notebook(32, 2000, "mac", "белый");
        Notebook notebook3 = new Notebook(16, 1000, "mac", "черный");
        Notebook notebook4 = new Notebook(8, 1000, "win", "черный");
        Notebook notebook5 = new Notebook(32, 2000, "mac", "белый");
        Notebook notebook6 = new Notebook(8, 500, "win", "серый");
        Notebook notebook7 = new Notebook(32, 3000, "win", "черный");
        
        Set <Notebook> nout = new HashSet<>();
        nout.add(notebook1);
        nout.add(notebook2);
        nout.add(notebook3);
        nout.add(notebook4);
        nout.add(notebook5);
        nout.add(notebook6);
        nout.add(notebook7);

            System.out.println("Введите цифру, соответствующую необходимому критерию:");
            System.out.print("1) ОЗУ" + "\n");
            System.out.print("2) Объем ЖД" +"\n");
            System.out.print("3) Операционная система" +"\n");
            System.out.print("4) Цвет" +"\n");
            Scanner iScanner = new Scanner(System.in);
            int input = iScanner.nextInt();
            if (input == 1) {
                System.out.print("Введите минимальное значение ОЗУ ");
                int minram = iScanner.nextInt();
                System.out.print("Введите максимальное значение ОЗУ ");
                int maxram = iScanner.nextInt();
                for (Notebook notebook : nout) {
                    if(notebook.getRam() >= minram && notebook.getRam() <= maxram){
                    System.out.println(notebook);
                    System.out.println();
                    }
                }
            }
            if (input == 2){
                System.out.print("Введите минимальное значение HDD ");
                int minhdd = iScanner.nextInt();
                System.out.print("Введите максимальное значение HDD ");
                int maxhdd = iScanner.nextInt();
                for (Notebook notebook : nout) {
                    if(notebook.getHdd() >= minhdd && notebook.getHdd() <= maxhdd){
                    System.out.println(notebook);
                    System.out.println();
                    }
                }
            }
            if (input == 3){
                System.out.print("1) Win" +"\n");
                System.out.print("2) Mac" +"\n");
                int inputOS = iScanner.nextInt();
                if(inputOS == 1){
                    for (Notebook notebook : nout) {
                        if(notebook.getOs() == "win"){
                        System.out.println(notebook);
                        System.out.println();
                        }
                    }
                }
                if(inputOS == 2){
                    for (Notebook notebook : nout) {
                        if(notebook.getOs() == "mac"){
                        System.out.println(notebook);
                        System.out.println();
                        }
                    }
                }

            }
            if (input == 4) {
                System.out.print("1) Черный" +"\n");
                System.out.print("2) Белый" +"\n");
                System.out.print("3) Серый" +"\n");
                int inputcolor = iScanner.nextInt();
                if(inputcolor == 1){
                    for (Notebook notebook : nout) {
                        if(notebook.getColor() == "черный"){
                        System.out.println(notebook);
                        System.out.println();
                        }
                    }
                }
                if(inputcolor == 2){
                    for (Notebook notebook : nout) {
                        if(notebook.getColor() == "белый"){
                        System.out.println(notebook);
                        System.out.println();
                        }
                    }
                }
                if(inputcolor == 3){
                    for (Notebook notebook : nout) {
                        if(notebook.getColor() == "серый"){
                        System.out.println(notebook);
                        System.out.println();
                        }
                    }
                }
            }
    }
}
