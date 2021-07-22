Задача №3_ Массивы
Выполните следующие действия с массивом:

Задайте массив из 5 любых целых чисел.
Поменяйте местами первый и последний элемент в массиве.
Вывести в консоль результат суммы первого и среднего элемента.
Примечание : Для получения последнего и среднего элементов в массиве используйте свойство length.
 */
public class TaskWork03 {
    public static void main(String[] args) {
        int[] nums = new int[] {25, 12, 100, 1, 5};
        int length = nums.length;
        int temp = nums[0];
        nums [0] = nums[4];
        nums [4] = temp;
        System.out.println(nums[0]);
        System.out.println(nums[4]);
        System.out.println(nums[0]+nums[2]);


    }
}