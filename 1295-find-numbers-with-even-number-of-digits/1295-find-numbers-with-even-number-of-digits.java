class Solution {
    public boolean evenDigits(int num){
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        return count%2==0;
    }
    public int findNumbers(int[] nums) {
        int evencount=0;
        for(int i=0;i<nums.length;i++){
            if(evenDigits(nums[i])){
                evencount++;
            }
        }
        return evencount;
    }
}