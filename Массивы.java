import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        // Метод toString() - преобразует массив в строковое представление
        int[] arr = {3, 1, 4, 1, 5};
        System.out.println(Arrays.toString(arr)); // Вывод: [3, 1, 4, 1, 5]

        // Метод sort() - сортирует массив в порядке возрастания
        Arrays.sort(arr); // Теперь массив arr стал {1, 1, 3, 4, 5}

        // Метод binarySearch() - ищет элемент в отсортированном массиве
        System.out.println(Arrays.binarySearch(arr, 4)); // Вывод: 3

        // Метод equals() - сравнивает два массива на равенство
        int[] arr2 = {1, 1, 3, 4, 5};
        System.out.println(Arrays.equals(arr, arr2)); // Вывод: true

        // Метод compare() - лексикографическое сравнение массивов
        System.out.println(Arrays.compare(arr, arr2)); // Вывод: 0
    }
}
