class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
         int n=intervals.length;
         if(n==0)return 0;
        Arrays.sort(intervals ,(a,b) ->{
            if(a[1]==b[1]){
                return b[0]-a[0];
            }
            return a[1]-b[1];
              
        });
        int cnt=2;
        int[] maxi=new int[2];
        maxi[0]=intervals[0][1]-1;
        maxi[1]=intervals[0][1];

        for(int i=1;i<n;i++){
            if(maxi[1]<intervals[i][0]){
                cnt+=2;
                maxi[0]=intervals[i][1]-1;
                maxi[1]=intervals[i][1];
            }else if(maxi[0]<intervals[i][0]){
                cnt+=1;
                maxi[0]=maxi[1];
                maxi[1]=intervals[i][1];


            }

        }

      return cnt;
    }
}