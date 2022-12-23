class Solution {
    public boolean isSubsequence(String s, String t) {
       int pointer = 0;
       int counter =0;
    if(s.length()== 0){
        return true;
    }
    while(pointer < s.length() && counter<t.length()){
        if(s.charAt(pointer) == t.charAt(counter)){
            pointer++;
        }
        counter++;
        if(pointer == s.length()){
            return true;
        }
    }
       return false;
    }
}
