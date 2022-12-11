class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> list = new ArrayList();
         for(int i : nums2){
            if(map.getOrDefault(i,0)>0){
                map.put(i, map.get(i)-1);
                list.add(i);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
