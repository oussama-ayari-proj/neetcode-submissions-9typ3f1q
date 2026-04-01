class Solution {
    public int[] twoSum(int[] numbers, int target) {
        List<Integer> l = new ArrayList<>();
        for(int n : numbers){
            l.add(n);
        }
        int [] output = new int[2];
        for(int i = 0 ; i<l.size() ;  i++){
            if(l.contains(target-l.get(i)) && l.get(i)+l.get(l.indexOf(target-l.get(i))) ==target ){
                output[0]= i+1;
                output[1]=l.indexOf(target-l.get(i))+1;
                return output;
            }
        }
        return output;
    }
}
