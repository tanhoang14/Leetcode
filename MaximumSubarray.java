class Solution {
    public int maxSubArray(int[] nums) {
        // Check if the length of the array is zero.
        if(nums.length == 0) return 0;

        // Initialize the maximum sum found so far to the first element in the array.
        int max = nums[0];

        // Initialize the current sum to the maximum of 0 and the first element in the array.
        int sum = Math.max(0, max);

        // Iterate through the elements of the array, starting from the second element.
        for (int i = 1; i < nums.length; i++) {
            // If the current sum is negative, reset it to zero.
            if (sum < 0) sum = 0;
            // Update the current sum by adding the current element.
            sum += nums[i];
            // Update the maximum sum found so far by taking the maximum of the current sum and the maximum sum found so far.
            max = Math.max(sum, max);
        }
        // Return the maximum sum found.
        return max;
    }
}
