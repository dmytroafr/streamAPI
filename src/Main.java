import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Alina", 24));
        personList.add(new Person("Marina", 23));
        personList.add(new Person("Anna", 25));
        personList.add(new Person("Svitlana", 24));
        personList.add(new Person("Maria", 22));
        personList.add(new Person("Olesya", 23));
        personList.add(new Person("Olena", 21));
        personList.add(new Person("Kristina", 26));
        personList.add(new Person("Yulya", 22));
        personList.add(new Person("Natali", 25));
        personList.add(new Person("Ilona", 24));
        personList.add(new Person("Kate", 23));

        personList.stream()
                .filter(person -> person.getAge() >=23)
                .sorted(Comparator.comparing(Person::getName))
                .forEach (System.out::println);



    }

}