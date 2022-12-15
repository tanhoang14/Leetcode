class Solution {
    public String longestCommonPrefix(String[] strs) {
        String commonPrefix = "";
        if(strs.length == 0){
            return commonPrefix;
        }
        int index = 0;
        for( char word : strs[0].toCharArray()){
            for(int i = 1; i < strs.length;i++){
                if(index >= strs[i].length() || word != strs[i].charAt(index)){
                    return commonPrefix;
                }
            }
            commonPrefix += word;
            index++;
        }
        return commonPrefix;
    }
}
