class Solution {
    public boolean isValidSudoku(char[][] board) {


       for(int i =0 ; i<board.length;i++){
        Set<Character> setLines = new HashSet<>();
        Set<Character> setCols = new HashSet<>();
        Set<Character> setOfTriplets = new HashSet<>();
        int tripletsFollower = 0;
        int counter = 0;
            for(int j = 0 ; j< board[i].length ;j++){
                if(board[i][j]!='.' &&  !setLines.add(board[i][j])){
                    return false;
                }
                if(board[j][i]!='.' && !setCols.add(board[j][i])){
                    return false;
                }
                int rowIdx = 3 * (i / 3) + j / 3;
                int colIdx = 3 * (i % 3) + j % 3;
                if (board[rowIdx][colIdx] != '.' && !setOfTriplets.add(board[rowIdx][colIdx])) {
                    return false;
                }
                
            }  
       }
       return true; 
    }
}
