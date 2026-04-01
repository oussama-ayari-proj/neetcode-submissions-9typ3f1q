// Definition for a pair.
// class Pair {
//     public int key;
//     public String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> mergeSort(List<Pair> pairs) {
        return mergeSortHelper(pairs,0,pairs.size()-1);
    }

    List<Pair> mergeSortHelper(List<Pair> pairs,int startIndex,int endIndex){
        if(endIndex - startIndex +1 <=1)
            return pairs;
            
        int middleIndex=(endIndex+startIndex)/2;
            
        mergeSortHelper(pairs,startIndex,middleIndex);
        mergeSortHelper(pairs,middleIndex+1,endIndex);

        merge(pairs,startIndex,middleIndex,endIndex);

        
        return pairs;
    }
    void merge(List<Pair> pairs,int startIndex, int middleIndex, int endIndex){
        

        List<Pair> right=new ArrayList<>(pairs.subList(startIndex,middleIndex+1));
        List<Pair> left= new ArrayList<>(pairs.subList(middleIndex+1,endIndex+1));

        int leftPointer=0;
        int rightPointer=0;
        int pairsPointer=startIndex;

        while(leftPointer < left.size() && rightPointer < right.size()){
            if( left.get(leftPointer).key < right.get(rightPointer).key ){
                
                pairs.set(pairsPointer,left.get(leftPointer));
                leftPointer++;

            }else {
                
                pairs.set(pairsPointer,right.get(rightPointer));
                rightPointer++;

            }
            pairsPointer++;
        }

        while(leftPointer < left.size()){
            pairs.set(pairsPointer,left.get(leftPointer));
            leftPointer++;
            pairsPointer++;
        }

        while(rightPointer < right.size()){
            pairs.set(pairsPointer,right.get(rightPointer));
            rightPointer++;
            pairsPointer++;
        }
        
    }
}
