class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pQueue
            = new PriorityQueue<Integer>();
        for(int s : stones){
            pQueue.offer(-s);
        }
        while(pQueue.size()>1){
            int first = pQueue.poll();
            int second = pQueue.poll();
            if(second>first){
                pQueue.offer(first-second);
            }
        }
        pQueue.offer(0);
        return Math.abs(pQueue.peek());
    }
}
