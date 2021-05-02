package Collection;

import java.util.*;

public class Example {
    List<Integer> arrayList = new ArrayList<>();
    List<Integer> linkedList = new LinkedList<>();

    //уникальные значения
    Set<Integer> setList = new HashSet<>();//рандомно
    Set<Integer> setList2 = new LinkedHashSet<>();//в порядке добавления
    Set<Integer> setList3 = new TreeSet<>();//отсортированная

    //значения Ключ, Атрибут
    Map<Integer, String> map = new HashMap<>();//отображение рандомно
    Map<Integer, String> map2 = new LinkedHashMap<>();// В порядке добавления
    Map<Integer, String> map3 = new TreeMap<>();//отображение в порядке сортировки

    Deque<Integer> deque = new ArrayDeque<>();//очередь -> первый зашёл, первый вышел
}
