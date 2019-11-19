package HomeworkCollections;

import homework3.Demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class MainClass {
    private Random random = new Random();
    private static MainClass m = new MainClass();

    private Map<String, Integer> generateOnlinerCategs() {
        Map<String, Integer> map = new HashMap<>();

        String[] onlinerCategsList = {"Электродрели и дрели-шуруповерты", "Перфораторы", "Наборы ручных инструментов",
                "Электроотвертки", "Шуруповерты, винтоверты", "Аккумуляторы и зарядные устройства для инструмента",
                "Дрели-миксеры", "Угловые шлифмашины (болгарки)", "Шлифмашины", "Полировальные машины", "Мультитулы",
                "Дисковые пилы", "Сабельные пилы", "Лобзики", "Рубанки", "Строительный, слесарный, монтажный инструмент",
                "Ящики для инструментов", "Фрезеры", "Промышленные фены", "Термоклеевые пистолеты", "Граверы",
                "Хозяйственные пылесосы", "Краскораспылители", "Штроборезы", "Плиткорезы", "Паяльники и паяльные лампы",
                "Аппараты для сварки труб", "Электрические отбойные молотки", "Электрические ножницы по металлу",
                "Скобозабиватели, гвоздезабиватели, степлеры", "Диагностические тепловизоры и пирометры"};
        for (String s : onlinerCategsList) {
            map.put(s, random.nextInt(1000));
        }
        return map;
    }

    private Book[] generateArrayOfBooks(int count, int flag) {
        Book[] books = new Book[count];

        String[] titles = {"Sun", "Moon", "Winter", "sun", "moon", "winter", "October", "october"};
        String[] authorNames = {"Olga", "Tatiana", "Pavel"};
        String[] authorSurnames = {"Migalevich", "Romanovskaya", "Shved"};
        String[] authorSecondNames = {"Evgen'evna", "Vital'evna", "Olegovich"};
        for (int i = 0; i < count; i++) {
            if (flag == 1) {
                books[i] = new Book(Demo.getRandom(titles), Demo.getRandom(authorNames), Demo.getRandom(authorSurnames),
                        Demo.getRandom(authorSecondNames), random.nextInt(2019), random.nextInt(150));
            } else {
                books[i] = new Book(Demo.getRandom(titles), Demo.getRandom(authorNames), random.nextInt(2019), random.nextInt(150));
            }
        }
        return books;
    }

    public static void main(String[] args) {
        runTask1();
        runTask23();
        runTask4();
        runTask5();
    }

    private static void runTask1() {
        System.out.println("1. Создать экземпляр класса LinkedList, разместить в нём 3 ссылки на объекты класса Book. \n" +
                "List< Book > list = new LinkedList< Book >();\n" +
                "Вывести информацию о всех книгах. Программно удалить из коллекции вторую книгу, вывести на экран информацию о оставшихся книгах.");
        Book[] books = m.generateArrayOfBooks(3, 0);
        List<Book> list = new LinkedList<>();
        Collections.addAll(list, books);
        System.out.println(list.toString());
        list.remove(1);
        System.out.println(list.toString());
    }

    private static void runTask23() {
        System.out.println("2. Создать экземпляр класса HashSet, добавить в него 25 ссылок на экземпляры класса " +
                "Book, предусмотреть не менее 6 одинаковых по значению книг. ");
        Book[] books = m.generateArrayOfBooks(25, 1);

        Set<Book> set = new HashSet<>();

        Collections.addAll(set, books);
        for (int i = 0; i < 5; i++) {
            set.add(books[0]);
        }

        for (Book book : set) {
            System.out.println(book.toString());
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Вывести на экран информацию о книга" +
                " (содержащихся в коллекции HashSet), название которых начинается с гласной буквы.");
        for (Book book : set) {
            if ((book.getTitle().toUpperCase().toCharArray()[0] + "").toLowerCase().matches("[eyuioa]")) {
                System.out.println(book.toString());
            }
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println("3. Отсортировать коллекцию из задания 2 по фамилии, затем по имени, по отчеству" +
                " (эти поля надо добавить в класс Book для автора книги).");

        ArrayList<Book> arrayList = new ArrayList<>(set);
        Collections.sort(arrayList);

        for (Book book : arrayList) {
            System.out.println(book.toString());
        }
    }

    private static void runTask4() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("4. Создать экземпляр класса TreeSet, поместить в него объекты класса Student(надо его " +
                "спроектировать). Вывести на экран информацию о каждом чётном в списке студенте, каждого нечётного" +
                " студента удалить из коллекции.\n");
        Set<Student> treeSet = new TreeSet<>((s1, s2) -> {
            if (s1.getSurname().compareTo(s2.getSurname()) == 0) {
                return s1.getName().compareTo(s2.getName());
            } else return s1.getSurname().compareTo(s2.getSurname());
        });
        treeSet.add(new Student("Анна", "Шеин", LocalDate.of(1990, Month.APRIL, 25)));
        treeSet.add(new Student("Татьяна", "Романовская", LocalDate.of(1990, Month.APRIL, 25)));
        treeSet.add(new Student("Ольга", "Мигалевич", LocalDate.of(1987, Month.JANUARY, 8)));
        treeSet.add(new Student("Павел", "Швед", LocalDate.of(1990, Month.OCTOBER, 17)));
        for (Student student : treeSet) {
            System.out.println(student);
        }
        Iterator<Student> iterator = treeSet.iterator();
        int i = 1;
        List<Student> removeList = new ArrayList<>();


        while (iterator.hasNext()) {
            if (i % 2 == 1) {
                removeList.add(iterator.next());
            } else iterator.next();
            i++;
        }
        treeSet.removeAll(removeList);
        System.out.println("-----------------------------RESULT-------------------------------");
        for (Student student : treeSet) {
            System.out.println(student);
        }
    }

    private static void runTask5() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("5. Создать экземпляр класса HashMap, разместить в нём следующую информацию: в качестве" +
                " ключа  - категория товара в каталоге (catalog.onliner.by) в качестве значения - количество товар" +
                "ов в данной категории. Сортировать коллекцию по количеству товаров в каждой категории, найти кате" +
                "горию в которой содержится максимальное количество товаров, удалить все категории в которых нет н" +
                "и одного товара (предусмотреть такие категории при заполнении коллекции)");

        Map<String, Integer> map = m.generateOnlinerCategs();
        map.put("Электрические ножницы", 0);
        TreeSet<Map.Entry<String, Integer>> sortedEntries = new TreeSet<>(
                (s1, s2) -> {
                    if (s1.getValue().compareTo(s2.getValue()) == 0) {
                        return s1.getKey().compareTo(s2.getKey());
                    } else return s1.getValue().compareTo(s2.getValue());
                }
        );
        sortedEntries.addAll(map.entrySet());

        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry);
        }
        System.out.println("-----------------------------MAX-------------------------------");
        System.out.println(sortedEntries.last());

        Iterator<Map.Entry<String, Integer>> iterator1 = sortedEntries.iterator();
        List<Map.Entry<String, Integer>> removeListEntries = new ArrayList<>();

        while (iterator1.hasNext()) {
            Map.Entry<String, Integer> entry = iterator1.next();
            if (entry.getValue() == 0) {
                removeListEntries.add(entry);
            }
        }
        sortedEntries.removeAll(removeListEntries);
        System.out.println("-----------------------------RESULT-------------------------------");
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry);
        }
    }


}
