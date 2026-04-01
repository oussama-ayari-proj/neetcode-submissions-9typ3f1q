class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] occ=new int[26];
        int max=0;
        for(char c : tasks){
            occ[c-'A']++;
            max=Math.max(occ[c-'A'],max);
        }
        if(max<=1) return tasks.length;

        int count=0;
        for(int i=0;i<26;i++){
            if(occ[i]==max)
                count++;
        }
        return Math.max(tasks.length,(n+1)*(max-1)+count);
    }
}