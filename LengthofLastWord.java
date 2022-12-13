class Solution {
    public int lengthOfLastWord(String s) {
        String lastWord = s.replaceAll("^.*?(\\w+)\\W*$", "$1");
        char[] arr= lastWord.toCharArray();
        int result = arr.length;
        return result; 
    }
}
