class Solution {
    public boolean isAnagram(String s, String t) {
        char Arr1[] = s.toCharArray();
        char Arr2[] = t.toCharArray();
        
        Arrays.sort(Arr1);
        Arrays.sort(Arr2);
        
        String sortedString1 = new String(Arr1);
        String sortedString2 = new String(Arr2);
        if(sortedString1.equals(sortedString2)){
            return true;
        }
        else if(s.length()!= t.length()){
            return false;
        }
        else{
            return false;
        }
    }
}
