import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // CumulativeSum
//       System.out.println(CumulativeSum.cumulativeSum(new int[]{1, 2, 3, 4}));
//       System.out.println(CumulativeSum.cumulativeSum(new int[]{1, 1, 1, 1, 1}));
//       System.out.println(CumulativeSum.cumulativeSum(new int[]{1, 3, 5, 7, 9}));

        // PositiveCumulativeSum
//        PositiveCumulativeSum positiveCumulativeSum = new PositiveCumulativeSum();
//        System.out.println(positiveCumulativeSum.getPositiveCumulativeSum(new int[]{1, -2, 3, 4, -6}));
//        System.out.println(positiveCumulativeSum.getPositiveCumulativeSum(new int[]{1, -1, -1, -1, 1}));
//        System.out.println(positiveCumulativeSum.getPositiveCumulativeSum(new int[]{1, 3, 5, 7}));

        // IdenticalTwins
//         IdenticalTwins identicalTwins = new IdenticalTwins();
//         System.out.println(identicalTwins.getIdenticalTwinsCount(new int[]{1, 2, 3, 2, 1}));
//         System.out.println(identicalTwins.getIdenticalTwinsCount(new int[]{1, 2, 2, 3, 2, 1}));
//         System.out.println(identicalTwins.getIdenticalTwinsCount(new int[]{1, 1, 1, 1}));

        //EvenNumberDigits
//        EvenNumberDigits evenNumberDigits = new EvenNumberDigits();
//        System.out.println(evenNumberDigits.getEvenDigitNumbers(new int[]{42, 564, 5775, 34, 123, 454, 1, 5, 45, 3556, 23442}));

        //ImplementInsertionSort
//        Scanner scanner = new Scanner(System.in);
//
//        // Read number of test cases
//        int T = scanner.nextInt();
//        scanner.nextLine();
//
//        List<int[]> testCases = new ArrayList<>();
//
//        // Read each test case
//        for (int i = 0; i < T; i++) {
//            int n = scanner.nextInt();
//            int[] arr = new int[n];
//            for (int j = 0; j < n; j++) {
//                arr[j] = scanner.nextInt();
//            }
//            testCases.add(arr);
//        }
//
//        ImplementInsertionSort implementInsertionSort = new ImplementInsertionSort();
//        // Process each test case
//        for (int[] arr : testCases) {
//            implementInsertionSort.insertionSort(arr);
//            // Print the sorted array
//            for (int num : arr) {
//                System.out.print(num + " ");
//            }
//            System.out.println();
//        }
//
//        scanner.close();

        //MergeTwoSortedArrays
        MergeTwoSortedArrays mergeTwoSortedArrays = new MergeTwoSortedArrays();
        int [] arr1 = new int[]{1, 2, 3, 4, 4};
        int [] arr2 = new int[]{2, 4, 5, 5};
        int[] arr = mergeTwoSortedArrays.sortedMerge(arr1, arr2);
        System.out.println(Arrays.toString(arr));
    }
}