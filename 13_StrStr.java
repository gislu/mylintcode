class Solution {
    /**
     * Returns a index to the first occurrence of target in source,
     * or -1  if target is not part of source.
     * @param source string to be scanned.
     * @param target string containing the sequence of characters to match.
     */
    public int strStr(String s, String t) {
        //write your code here
        if(s == null || t == null){
            return -1;
        }
        
        for(int i =0; i < s.length() - t.length() + 1; i++){
            int j =0;
            for(j = 0; j < t.length(); j++){
                if(s.charAt(i + j) != t.charAt(j)){
                    break;
                }
            }
            if(j == t.length()){
                return i;
            }
        }
        return -1;
    }
}