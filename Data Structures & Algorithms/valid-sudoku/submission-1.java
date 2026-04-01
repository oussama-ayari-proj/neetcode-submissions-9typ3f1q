class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<String,Set<Character>> map = new HashMap<>();
        for(int i = 0 ; i<board.length; i++){
            Set<Character> colCheck = new HashSet<>();
            Set<Character> rowCheck = new HashSet<>();
            for(int j=0 ; j<board.length ; j++){ 
                if(board[i][j]!='.'  && !rowCheck.add(board[i][j])){
                    return false;
                }
                if( board[j][i]!='.'  && !colCheck.add(board[j][i])){
                    return false;
                }
                int r = i/3;
                int c = j/3;
                StringBuilder s = new StringBuilder();
                s.append(r).append(c).append("#");
                if(map.containsKey(s.toString())){
                    Set<Character> set = map.get(s.toString());
                    if(board[i][j]!='.'  && !set.add(board[i][j])){
                        return false;
                    }
                    map.put(s.toString(),set);
                }else{
                    if(board[i][j]!='.'){
                    Set<Character> set = new HashSet<>();
                    set.add(board[i][j]);
                    map.put(s.toString(),set);
                    }
                }
            }
        }
        for(Map.Entry<String,Set<Character>> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        return true;
    }
}
