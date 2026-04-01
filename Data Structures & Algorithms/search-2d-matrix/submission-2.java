class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //solution mtaa wehed kalb f rassou
        //do one loop checking where m[i,n] > target if so you know that the row is i(th) row 
        //so do one check on that row instead of searching in every row
        
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
    }
}
