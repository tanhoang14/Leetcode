class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<>();
        HashSet<Integer> sets = new HashSet<>();
        for(int i: nums){
            sets.add(i);
        }
        for(int i= 1; i<=nums.length;i++){
            if(!sets.contains(i)){
            missingNumbers.add(i);
        }
     }
     return missingNumbers;
    }
}
