class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length ==0) return 0;

        int max = nums[0];
        int sum = Math.max(0, max); 
        for (int i=1; i<nums.length; i++){
            sum += nums[i];

            max = Math.max(sum,max);
            if(sum <0) sum=0;
        }  
        return max;     
    }
}
