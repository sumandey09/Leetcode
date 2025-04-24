class Solution {
    public int trap(int[] height) {
       int l=0;
       int n=height.length;
       int r=n-1;
       int rightmax=0;
       int leftmax=0;
       int ans=0;
       while(l<r){
        if(height[l]<=height[r]){
        if(leftmax>height[l]){
            ans+=leftmax-height[l];
        }else{
            leftmax=height[l];
        }
        l++;
       }else{
        if(rightmax>height[r]){
            ans+=rightmax-height[r];
        }else{
            rightmax=height[r];
        }
        r--;
       }
       }
       return ans;
    }
}
