class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        int counter = 0;
        for(int i=0; i<nums.length;i++){
            if(i!=0 && (nums[i]-nums[i-1]==1)){
                counter++;
                result = Math.max(counter,result);
            }
            else if(i!=0 && nums[i]== nums[i-1]){
                continue;
            }
            else{
                counter = 1; 
                result = Math.max(counter,result);

            }
        }
        return result;
    }
}
