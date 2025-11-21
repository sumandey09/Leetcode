class Solution {
    public int countPalindromicSubsequence(String s) {
        int n=s.length();
        Set<Character> letters= new HashSet<>();
        for(int i=0;i<n;i++){
            letters.add(s.charAt(i));
        }
        int res=0;
        for(char letter:letters){
            int left=-1;
            int right=-1;
            for(int i=0;i<n;i++){
                if(s.charAt(i)==letter){
                    if(left==-1){
                        left=i;
                    }
                    right=i;
                   
                }
                
            }
            Set<Character> st= new HashSet<>();
            for(int middle=left+1;middle<=right-1;middle++){
                st.add(s.charAt(middle));

            }
            res+=st.size();
        }
        return res;
    }
}