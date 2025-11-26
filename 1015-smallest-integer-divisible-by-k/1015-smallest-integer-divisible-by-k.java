class Solution {
    public int smallestRepunitDivByK(int k) {
        int rem=1;
        int len=1;
        Set<Integer> st =new HashSet<>();

        while(rem%k!=0){
            len++;
            int n=(rem*10+1)%k;
            
            rem=n%k;
            if(st.contains(rem)){
                return -1;
            }
            st.add(rem);

        }
        return len;
    }
}