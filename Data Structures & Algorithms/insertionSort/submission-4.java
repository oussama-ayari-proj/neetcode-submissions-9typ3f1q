// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> res=new ArrayList<>();
        int n=pairs.size();
        for(int i=0;i<n;i++){
            int j=i-1;
            while(j>=0 && pairs.get(j).key>pairs.get(j+1).key){
                Pair tmp=pairs.get(j);
                pairs.set(j,pairs.get(j+1));
                pairs.set(j+1,tmp);
                j--;
            }
            List<Pair> copy=new ArrayList<>(pairs);
            res.add(copy);
        }

        return res;
    }
}
