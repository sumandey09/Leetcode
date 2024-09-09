class Solution {
    public void sortColors(int[] arr) {
    //    Arrays.sort(nums);
    int zero = 0;
    int one = 0;
     for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) 
                zero++;
            else if (arr[i] == 1) 
                one++;
        }

    for (int i = 0; i < arr.length; i++) {
            if (zero > 0) {
                arr[i] = 0;
                zero--;
            } else if (one > 0) {
                arr[i] = 1;
                one--;
            } else {
                arr[i] = 2;
            }
        }
    }
}