package ru.rtinform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс содержит методы для подсчета количества
 * всех элементов списка/массива, методы возвращают ассоциативный массив,
 * где ключ – элемент списка/массива,
 * значение – количество этих элементов в списке/массиве.
 * Пример: [1, 3, 4, 5, 1, 5, 4] -> {1 = 2, 3 = 1, 4 = 2, 5 = 2}
 * @author Азамат Султангареев / asultangareev@gmail.com
 * @version 1.0
 */
public class Counter {

    /**
     * Метод работает с массивом целочисленных элементов
     * @param array массив целочисленных элементов
     * @return возвращает ассоциативный массив,
     * где ключ – элемент массива,
     * значение – количество этих элементов в массиве
     */
    public Map<Integer, Integer> countElements(int[] array) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int j : array) {
            if (result.containsKey(j)) {
                result.put(j, result.get(j) + 1);
            } else {
                result.put(j, 1);
            }
        }
        return result;
    }

    /**
     * Метод работает со списком целочисленных элементов
     * @param list список целочисленных элементов
     * @return возвращает ассоциативный массив,
     * где ключ – элемент списка,
     * значение – количество этих элементов в списке
     */
    public Map<Integer, Integer> countElements(List<Integer> list) {
        Map<Integer, Integer> result = new HashMap<>();
        for (Integer element : list) {
            if (result.containsKey(element)) {
                result.put(element, result.get(element) + 1);
            } else {
                result.put(element, 1);
            }
        }
        return result;
    }

}