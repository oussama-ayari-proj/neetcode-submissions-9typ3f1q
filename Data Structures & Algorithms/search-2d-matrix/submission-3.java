class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //solution mtaa wehed kalb f rassou
        //do one loop checking where m[i,n] > target if so you know that the row is i(th) row 
        //so do one check on that row instead of searching in every row

        // this solution has better runtime than binary search solution
        //*********************************************************************
        /*
        for(int i = 0 ; i< matrix.length ;i++){
            //this if statement will be executed only once
            if(matrix[i][matrix[i].length-1] >=target){

                for (int j=0 ; j< matrix[i].length ;j++){
                    if(matrix[i][j]==target){
                        return true;
                    }
                }
            }
            
        }
        return false;
        */
        //********************************************************************************

        for(int i = 0 ; i< matrix.length ;i++){
            int left  = 0 ;
            int right = matrix[i].length-1;
            while(left<=right){
                int mid = (left+right)/2;
                if(matrix[i][mid]>target){
                    right = mid-1;
                }else if ( matrix[i][mid]<target){
                    left = mid+1;
                }else{
                    return true;
                }
            }
           
        }
         return false;
    }
}
