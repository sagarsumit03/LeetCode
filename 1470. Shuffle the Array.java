class Solution {
    public int[] shuffle(int[] nums, int n) {
        if (nums == null) {
            return nums;
        }
        int[] result = new int[nums.length];
        var x = n;
        var y = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                result[i] = nums[y];
                y++;
            } else {
                result[i] = nums[x];
                x++;
            }
        }
        return result;
    }
}
