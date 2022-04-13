class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans =new int[n][n];
        if(n==0){
            return ans;
        }
        int sr=0;
        int er=n-1;
        int sc=0;
        int ec=n-1;
        int count=1;
        while(sr<=er &&sc<=ec){
            //move towards right
            for(int j=sc;j<=ec;j++)
            {
                ans[sr][j]=count++;
            }
            sr++;
            //move towards down
            for(int i=sr;i<=er;i++){
                ans[i][ec]=count++;
            }
            ec--;
            if(sr<=er){
                //move towards left
                for(int j=ec;j>=sc;j--){
                    ans[er][j]=count++;
                }
            }
            er--;
            if(sc<=ec){
                //move towards top
                for(int i=er;i>=sr;i--){
                    ans[i][sc]=count++;
                }
            }
            sc++;
        }
        return ans;
    }
}