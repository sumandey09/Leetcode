class Solution {
    public int[][] kClosest(int[][] points, int k) {
        // Min Heap (sorted by Euclidean distance)
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> 
            (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1])
        );

        // Add all points to the heap
        for (int[] point : points) {
            pq.offer(point);
        }

        // Extract k closest points
        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll(); // Remove the smallest (closest) element
        }
        
        return ans;
    }
}