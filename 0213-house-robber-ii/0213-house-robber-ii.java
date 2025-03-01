import java.util.ArrayList;

class Solution {
    static long solve(ArrayList<Integer> arr) {
        int n = arr.size();
        long prev = arr.get(0);
        long prev2 = 0;

        for (int i = 1; i < n; i++) {
            long pick = arr.get(i);
            if (i > 1)
                pick += prev2;
            long nonPick = prev;

            long cur_i = Math.max(pick, nonPick);
            prev2 = prev;
            prev = cur_i;
        }
        return prev;
    }

    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0]; 

        ArrayList<Integer> nums1 = new ArrayList<>();
        ArrayList<Integer> nums2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i != 0) nums1.add(nums[i]); 
            if (i != n - 1) nums2.add(nums[i]);
        }

        return (int) Math.max(solve(nums1), solve(nums2)); 
    }
}
