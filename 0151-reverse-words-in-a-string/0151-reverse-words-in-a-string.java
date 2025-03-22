class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder ans = new StringBuilder();
        
        // Reverse the order of words
        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]).append(" ");
        }
        
        // Remove the last extra space and return
        return ans.toString().trim();
     }
}