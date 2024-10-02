class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>(){
            public int compare(int x[], int y[]){
                return x[0] - y[0]; //cust comp, inc sort
            }
        });
        for(int i=0;i<n;i++){
            pq.offer(new int[]{arr[i],i});
        }
       
        int rank=0;
        int prev=Integer.MAX_VALUE;
        while(!pq.isEmpty()){
            int cur[] = pq.poll();
            if(prev!=cur[0]){
                prev = cur[0];
                rank++;
            }
            arr[cur[1]] = rank;
        }
        return arr;
    }
}