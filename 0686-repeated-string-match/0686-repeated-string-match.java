class Solution {
    public int repeatedStringMatch(String a, String b) {
        int len_b=b.length();
        int len_a=a.length();
        int n=(len_b/len_a);
        int cnt=n;
        String ans="";
        for (int i = 0; i < cnt; i++){
             ans=ans+a;
        }
        if(ans.toString().contains(b)){
            return n;
        }
        ans=ans+a;
        if(ans.toString().contains(b)){
            return n+1;
        }
        ans=ans+a;
        if(ans.toString().contains(b)){
            return n+2;
        }
       return -1;
       
    }
}