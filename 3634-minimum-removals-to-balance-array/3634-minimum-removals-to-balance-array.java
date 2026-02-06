class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=0;
        int n=nums.length;
        int l=1;
        while(j<n){
            int max=nums[j];
            int min=nums[i];
            while(i<j&&(long)max>(long)k*min){
                i++;
                min=nums[i];
            }
            l=Math.max(l,j-i+1);
            j++;

        }
        return n-l;
        
    }
}