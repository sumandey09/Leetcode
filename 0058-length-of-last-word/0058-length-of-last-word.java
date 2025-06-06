class Solution {
    public int lengthOfLastWord(String s) {
       int len=s.length()-1;
       while(s.charAt(len)==' '){
        len--;
       }
       int cnt=0;
       while(len>=0 && s.charAt(len)!=' '){
        cnt++;
        len--;
       }
       return cnt;
    }
}