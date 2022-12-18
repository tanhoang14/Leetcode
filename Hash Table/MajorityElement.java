class Solution {
    public int majorityElement(int[] nums) {
       Map<Integer,Integer> map = new HashMap<>();
       for( int i : nums){
           //if hashmap contain that number and that number appear more than 1
           if(map.containsKey(i) && map.get(i)+1 > nums.length/2){
               return i;
           }
           else{
               map.put(i, map.getOrDefault(i,0)+1);
           }
       }
       return nums[0];
    }
}
