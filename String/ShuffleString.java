class Solution {
    public String restoreString(String s, int[] indices) {
        char[] c = s.toCharArray();
        for(int i = 0; i< indices.length; i++){
            c[indices[i]] = s.charAt(i);
        }
        return new String(c);
    }
}
