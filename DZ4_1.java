//Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.LinkedList;


public class DZ4_1 {
    public static void main(String[] args) {
        LinkedList<String> List = new LinkedList<>();
        List.add("1");
        List.add("2");
        List.add("3");
        List.add("4");
        List.add("5");

        System.out.println(List);
        LinkedList<String> Newlist = perevorot(List);
        System.out.print(Newlist);
    }

    public static LinkedList<String>  perevorot (LinkedList<String> inputList)  {
        LinkedList<String> Newlist = new LinkedList<>();
        int c = inputList.size() - 1;
        for (int i = 0; i < inputList.size(); i++){
            Newlist.add(inputList.get(c-i));
        }
        return Newlist;

}
}