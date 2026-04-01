public class Solution {
        public int MaxArea(int[] height)
    {

        int max = 0;
        for (int i = 0; i < height.Length; i++)
        {
            Console.WriteLine("------------------------->");
            for (int j = i+1; j < height.Length; j++)
            {
                var minlocal = int.Min(height[i], height[j])*(j-i);
                if(minlocal > max)
                    max = minlocal;

            }
                
        }
        return max;
    }
}
    

