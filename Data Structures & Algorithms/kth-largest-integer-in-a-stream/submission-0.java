class KthLargest {

    private int k;
    private PriorityQueue<Integer> queue;

    public KthLargest(int k, int[] nums) {
        this.k=k;
        this.queue= new PriorityQueue<>();
        for(int i : nums){
            queue.offer(i);
            if(queue.size()>k){
                queue.poll();
            }
           System.out.println(queue.toString());
        }
        System.out.println(queue.toString());
        System.out.println(queue.peek());
    }
    
    public int add(int val) {
        queue.offer(val);
        if (queue.size() > k) {
            queue.poll();
        }
        return queue.peek();
    }
}
