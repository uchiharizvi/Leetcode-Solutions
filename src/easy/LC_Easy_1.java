package easy;

public class LC_Easy_1 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
    }

    static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    res[i] = nums[i];
                    res[j] = nums[j];
                }
            }
        }
        return res;
    }


}
