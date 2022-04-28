import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        sort(array);
    }
    public static void sort(int[] array) {
        Arrays.sort(array);
        //IntStream intStream=Arrays.stream(array).filter(value -> value%2==0 );
        //System.out.println(intStream.boxed().mapToDouble());
    }
    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
        //strings.stream().forEach(e -> System.out.println(e));

    }
}
