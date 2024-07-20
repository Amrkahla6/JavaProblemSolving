import java.util.ArrayList;
import java.util.List;

public class PositiveCumulativeSum {
    List<Integer> getPositiveCumulativeSum (int[] arr) {
        List<Integer> positiveCumulativeSum = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > 0){
                positiveCumulativeSum.add(sum);
            }
        }

        return positiveCumulativeSum;
    }
}
