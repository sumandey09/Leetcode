class Solution {
    public int[] rearrangeArray(int[] arr) {
       ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();
        
        // Separate positive and negative numbers
        for (int x : arr) {
            if (x >= 0) positive.add(x);
            else negative.add(x);
        }
        
        int i = 0, j = 0, k = 0;
        // Re-arrange the elements to alternate positive and negative
        while (i < positive.size() && j < negative.size()) {
            if (k % 2 == 0) arr[k++] = positive.get(i++);
            else arr[k++] = negative.get(j++);
        }
        
        // Add remaining positive numbers if any
        while (i < positive.size()) arr[k++] = positive.get(i++);
        
        // Add remaining negative numbers if any
        while (j < negative.size()) arr[k++] = negative.get(j++);
        
        return arr; // Return the rearranged array
    }
}