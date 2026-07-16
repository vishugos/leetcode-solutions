class Solution {
    public int singleNumber(int[] nums) {

        int n = nums.length;
        int unique = 0;
        for (int i = 0; i < n; i++) {

            unique = unique ^ nums[i];

        }

        return unique;

    }
}