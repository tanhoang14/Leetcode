class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList();
        int s1 = s.length();
        int p1 = p.length();
        int[] alphabet1 = new int[26];
        int[] alphabet2 = new int[26];
         for(int i=0; i<p1; i++){
             alphabet1[p.charAt(i)-'a']++;

        }
        for(int i =0; i< s1; i++){
            alphabet2[s.charAt(i)-'a']++;
            if (i >= p1) {
                alphabet2[s.charAt(i - p1) - 'a']--;
            }
            
            if (Arrays.equals(alphabet1, alphabet2)) {
                result.add(i - p1 + 1);
            }
            
        }
       
        return result;

    }
}
