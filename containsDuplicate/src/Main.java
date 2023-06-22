import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,1};

        System.out.println(numbers);
    }

    public static boolean containsDuplicate(int[] nums) {
        if(nums==null || nums.length==0)
            return false;

        HashSet<Integer> set = new HashSet<Integer>();

        for(int i: nums)
        {
            if(!set.add(i))
            {
                return true;
            }
        }
        return false;
    }
}
