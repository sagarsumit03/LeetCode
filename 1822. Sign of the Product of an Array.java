class Solution {
    public int arraySign(int[] nums) {
        if (nums == null) {
            return 0;
        }
        var prod = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                nums[i] = 1;
            } else if (nums[i] < 0) {
                nums[i] = -1;
            } else {
                nums[i] = 0;
            }
        }
        for (int num : nums) {
            prod *= num;
        }
        if (prod > 0) {
            return 1;
        } else if (prod < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
