import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Создаем хэш-таблицу для хранения чисел и их индексов
        Map<Integer, Integer> map = new HashMap<>();

        // Проходимся по массиву
        for (int i = 0; i < nums.length; i++) {
            // Вычисляем значение, которое нужно найти
            int complement = target - nums[i];

            // Проверяем, есть ли "дополнение" в хэш-таблице
            if (map.containsKey(complement)) {
                // Если найдено, возвращаем индексы текущего числа и дополнения
                return new int[] { map.get(complement), i };
            }

            // Если нет, добавляем текущее число и его индекс в хэш-таблицу
            map.put(nums[i], i);
        }

        // Если не найдено, выбрасываем исключение (но по условию задачи всегда есть решение)
        throw new IllegalArgumentException("Нет решения");
    }

    public static void main(String[] args) {
        // Пример использования
        TwoSum solution = new TwoSum();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Вывод: [" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Вывод: [" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Вывод: [" + result3[0] + ", " + result3[1] + "]");
    }
}
