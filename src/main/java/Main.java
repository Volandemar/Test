import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("Николай", "Куплинов-Морозов", 21));
        listPerson.add(new Person("Елена", "Корпетова Великая", 29));
        listPerson.add(new Person("Оля", "Алетнова красна девица", 29));
        listPerson.add(new Person("Иван", "Попов из села Поповки", 16));
        listPerson.add(new Person("Сергей", "Коробкин-Мясников-Иванов", 25));
        listPerson.add(new Person("Аня","Петрова-Иванова-Осипова", 14));
        System.out.println("Список без сотритровки: " + listPerson);

        listPerson.removeIf(person -> person.getAge() < 18);
        Collections.sort(listPerson, new SortPersonLength(4));
        System.out.println("Список после сортировки: " + listPerson);
    }
}