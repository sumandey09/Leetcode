class Solution {
    public int maxArea(int[] height) {
       int i=0;
       int j=height.length-1;
       int max=0;
       while(i<j){
        int lh=height[i];
        int rh=height[j];
        int minh=Math.min(lh,rh);
        max=Math.max(max,minh*(j-i));
        if(lh<rh){
            i++;
        }else{
        j--;
        }
       }
       return max;
    }
}