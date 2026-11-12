class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=nums[i]*nums[i];
        // }
        // Arrays.sort(arr);
        // return arr;
        int l=0,k=n-1;
        for(int i=n-1;i>=0;i--){
            int val;
            if(Math.abs(nums[l])>Math.abs(nums[k])){
                val=nums[l];
                l++;
            }else{
                val=nums[k];
                k--;
            }
            arr[i]=val*val;
        }

        return arr;
    }
}