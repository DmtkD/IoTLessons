package ua.lviv.iot.lesson2;

import ua.lviv.iot.lesson2.model.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // About Array
        Object[] array = new Object[4];
        Student[] array1 = new Student[4];

        array1[0] = new Student("Zenyk", "Veres");
        System.out.println(array1);
        String toString = array1[0].toString();
        System.out.println(array1[0]);

        // About List
        // About ArrayList
        // int, double, float, char, bool - dont work

        System.out.println("\n ArrayList");

        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(10);
        list.addAll(Arrays.asList(2, 9, 15));

        System.out.println(list);
        System.out.println(list.get(3));

        list.remove(2);
        System.out.println(list);

        System.out.println(list.stream().sorted().toList());

        // LinkedList

        System.out.println("\n LinkedList");

        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(2);
        linkedList.addAll(Arrays.asList(3, 4, 6, 22, 33));

        System.out.println(linkedList);

        linkedList.remove(3);
        System.out.println(linkedList.get(4));

        // About Set
        System.out.println("\n Set");
        Set<Object> set = new HashSet<>();
        set.add("string");
        set.add(1);
        set.add(new Student("Pavlo", "Turchynyak"));
        set.add("Pavlo");
        set.add("Leshkovych");

        set.remove("Pavlo");
        set.forEach(System.out::println);

        // automatic sorted
        System.out.println("\n TreeSet");

        System.out.println(new LinkedList<>(set.stream().sorted().toList()));

        Set<String> set1 = new TreeSet<>();

        set1.add("Данило");
        set1.add("Павло");
        set1.add("Анна");
        set1.add("Ярослав");
        set1.add("Олександра");

        set1.forEach(System.out::println);

        Set<Object> set2 = new LinkedHashSet<>();

        // About Map
        // Key Value

        System.out.println("\n Map");

        Map<Object, String> map = new HashMap<>();

        map.put("Pavlo", "Turchynak");
        map.put("Zenyk", "Veres");
        map.put("Oleksandr", "Sobran");

        System.out.println(map);
        System.out.println(map.get("Pavlo"));

        map.put("Pavlo", "Veres");
        System.out.println(map);

        System.out.println(map.containsKey("Zenyk"));
        System.out.println(map.getOrDefault("Pavlo", "We dont have Ustym"));
    }
}
