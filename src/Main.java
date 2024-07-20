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
         IdenticalTwins identicalTwins = new IdenticalTwins();
         System.out.println(identicalTwins.getIdenticalTwinsCount(new int[]{1, 2, 3, 2, 1}));
         System.out.println(identicalTwins.getIdenticalTwinsCount(new int[]{1, 2, 2, 3, 2, 1}));
         System.out.println(identicalTwins.getIdenticalTwinsCount(new int[]{1, 1, 1, 1}));

    }
}