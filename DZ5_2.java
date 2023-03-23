import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// Пусть дан список сотрудников:
//Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени

public class DZ5_2 {
    public static void main(String[] args) {
        Map<String, Integer> Name = new HashMap<>();
        String spisok = "Иван Иванов " + "Светлана Петрова " + "Кристина Белова " + "Анна Мусина " + "Анна Крутова " + "Иван Юрин " + "Петр Лыков " + "Павел Чернов " + "Петр Чернышов " + "Мария Федорова " + "Марина Светлова " + "Мария Савина " + "Мария Рыкова " + "Марина Лугова " + "Анна Владимирова " + "Иван Мечников " + "Петр Петин " + "Иван Ежов ";
        String[] listspisok = spisok.split(" ");

        for (int i = 0; i < listspisok.length; i += 2) {
            if (Name.containsKey(listspisok[i])) {
                Name.replace(listspisok[i], Name.get(listspisok[i]) + 1);
            } else {
                Name.put(listspisok[i], 1);
            }
        }
        System.out.println(Name);
        Map<String, Integer> NameSort = new LinkedHashMap<>();
        int max = 1;
        for (int value : Name.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : Name.entrySet()) {
                String key = entry.getKey();
                if (Name.get(key) == i) {
                    NameSort.put(key, Name.get(key));
                }
            }
        }
        System.out.println(NameSort);

    }
    
}
