import java.util.ArrayList;
import java.util.Iterator;

public class RemoveEvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Исходный список: " + numbers);
        removeEvenNumbers(numbers);
        System.out.println("Список после удаления четных чисел: " + numbers);
    }

    public static void removeEvenNumbers(ArrayList<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            int number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
    }
}
