import java.util.ArrayList;
import java.util.List;

public class EvenNumberDigits {
    List<Integer> getEvenDigitNumbers (int[] arr) {
        // add your logic here
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (Integer.toString(arr[i]).length() % 2 == 0) {
                result.add(arr[i]);
            }
        }
        return result;
    }
}
