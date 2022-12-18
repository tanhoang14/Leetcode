class Solution {
    public boolean isPalindrome(int x) {
        String temp = Integer.toString(x);
        for( int i=0 ; i< temp.length()/2; i++){
            if(temp.charAt(i) != temp.charAt(temp.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
