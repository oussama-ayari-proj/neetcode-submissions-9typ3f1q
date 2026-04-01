class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack=new Stack<>();
        int n=position.length;
        int[][] cars=new int[n][2];
        for(int i=0;i<n;i++){
            cars[i][0]=position[i];
            cars[i][1]=speed[i];
        }
        Arrays.sort(cars,(a,b)->b[0]-a[0]);
        for(int[] car : cars)
            System.out.println(Arrays.toString(car));
        for(int[] car : cars){
            int pos=car[0];
            int sp=car[1];
            double arrivalTime=(double)(target-pos)/sp;
            if(!stack.isEmpty() && stack.peek()<arrivalTime)
                stack.push(arrivalTime);
            if(stack.isEmpty())
                stack.push(arrivalTime);
        }

        return stack.size();
    }
}
