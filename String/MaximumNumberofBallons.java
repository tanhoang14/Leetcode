class Solution {
    public int maxNumberOfBalloons(String text) {
        int result = 0;
        int[] alphabet = new int[26];
        String balloon = "balloon";
        for(int i=0; i<text.length(); i++){
            alphabet[text.charAt(i)-'a']++;
        }
        while(true){
            for(int i=0; i< balloon.length();i++){
                if(alphabet[balloon.charAt(i)-'a']-- <=0){
                    return result;
                }
            }
            result++;
        }
    }
}
