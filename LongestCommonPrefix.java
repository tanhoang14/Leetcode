class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
     // Set the initial prefix to the first string in the array
    String prefix = strs[0];

    // Iterate through the remaining strings in the array
    for(int i=1; i < strs.length; i++){

        // Check if the current string has the prefix as a prefix
        while(strs[i].indexOf(prefix) !=0){
    
            // If it doesn't, remove the last character from the prefix and try again
            prefix = prefix.substring(0, prefix.length()-1);
        }
    }

// After the loop, the variable "prefix" will contain the longest common prefix shared by all strings in the array
        return prefix;
    }
}
