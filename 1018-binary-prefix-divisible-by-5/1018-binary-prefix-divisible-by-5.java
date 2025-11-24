class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> st=new ArrayList<>();
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            ans=((ans*2)+nums[i])%5;
            
            st.add(ans==0?true:false);
        }
        return st;
    }
}