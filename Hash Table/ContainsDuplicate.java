class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.containsKey(nums[i])&& map.get(nums[i])>1){
                return true;
            }
        }
        return false;
    }
}
