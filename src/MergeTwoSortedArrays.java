import java.util.Arrays;

public class MergeTwoSortedArrays {

    public 	int[] sortedMerge(int[] A, int[] B) {
       int [] result = new int[A.length + B.length];

       for (int i = 0; i < A.length; i++){
           result[i] = A[i];
       }

       for (int i = 0; i < B.length; i++){
           result[A.length + i] = B[i];
       }

        Arrays.sort(result);
        return result;
    }
}
