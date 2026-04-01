class MinHeap {
    private List<Integer> minHeap;

    public MinHeap(){
        this.minHeap= new ArrayList<>();
        this.minHeap.add(0);
    }
    public void push(int val){
        this.minHeap.add(val);
        //reorder the heap
        int i = minHeap.size()-1;
        while(i>1 && minHeap.get(i)<minHeap.get(i/2)){
            if(minHeap.get(i)<minHeap.get(i/2)){
                int temp = minHeap.get(i);
                minHeap.set(i,minHeap.get(i/2));
                minHeap.set(i/2,temp);
                i=i/2;
            }
        }
    }
    public int pop(){
        if(minHeap.size()<=1){
            return -1;
        }
        if(minHeap.size()==2){
            return minHeap.remove(1);
        }
        int elementToPop=minHeap.get(1);
        minHeap.set(1,minHeap.remove(minHeap.size()-1));
       
        int i = 1;
        while(i*2<minHeap.size()){
            if (2*i + 1 < minHeap.size() &&
        minHeap.get(2 * i + 1) < minHeap.get(2 * i) &&
        minHeap.get(i) > minHeap.get(2 * i + 1)) {
            // Swap right child
            int tmp = minHeap.get(i);
            minHeap.set(i, minHeap.get(2 * i + 1));
            minHeap.set(2 * i + 1, tmp);
            i = 2 * i + 1;
        } else if (minHeap.get(i) > minHeap.get(2 * i)) {
            // Swap left child
            int tmp = minHeap.get(i);
            minHeap.set(i, minHeap.get(2 * i));
            minHeap.set(2 * i, tmp);
            i = 2 * i;
        } else {
            break;
        }
        }
        return elementToPop;
    }
    public int top(){
        if(minHeap.size()<=1){
            return -1 ; // null
        }
        return minHeap.get(1);
    }
    public void heapify(List<Integer> nums){

        this.minHeap= new ArrayList<>();
        this.minHeap.add(0);
        this.minHeap.addAll(nums);

        int i =(minHeap.size()-1)/2;
        while(i>0){
            int index =i;
            while(index*2<minHeap.size()){
               if (2 * index + 1 < minHeap.size() &&
                minHeap.get(2 * index + 1) < minHeap.get(2 * index) &&
                minHeap.get(index) > minHeap.get(2 * index + 1)) {
                // Swap right child
                int tmp = minHeap.get(index);
                minHeap.set(index, minHeap.get(2 * index + 1));
                minHeap.set(2 * index + 1, tmp);
                index = 2 * index + 1;
            } else if (minHeap.get(index) > minHeap.get(2 * index)) {
                // Swap left child
                int tmp = minHeap.get(index);
                minHeap.set(index, minHeap.get(2 * index));
                minHeap.set(2 * index, tmp);
                index = 2 * index;
            } else {
                break;
            }
            }
            i--;
        }
    }
}
   
