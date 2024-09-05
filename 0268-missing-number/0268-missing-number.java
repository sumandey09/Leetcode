class Solution {
    public int missingNumber(int[] n) {
        int sum1 = 0;
        for(int i = 0; i < n.length; i++) {
            sum1 += n[i];
        }
        int sum2 = n.length * (n.length + 1) / 2;
        return sum2 - sum1;
    }
}