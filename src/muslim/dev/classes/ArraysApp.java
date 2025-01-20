import java.util.Arrays;

public class ArraysApp {

    public static void main(String[] args) {

        int[] numbers = {
                1, 2, 5, 4, 77, 76, 4, 3, 556, 5
        };

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 43));
        System.out.println(Arrays.binarySearch(numbers, 199));

        int[] result = Arrays.copyOf(numbers, 7);
        System.out.println(Arrays.toString(result));
    }
}
