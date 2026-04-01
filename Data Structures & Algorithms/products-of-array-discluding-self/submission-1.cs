public class Solution {
   public  int[] ProductExceptSelf(int[] nums)
   {
       int[] res = new int[nums.Length];
       int i = 0;
       int len = nums.Length;
       while (i < len)
       {

           int total = 1; 
           for (int j = 0; j < nums.Length; j++)
           {
               if (i == j)
                   continue;
                else
               {
                  total = total * nums[j];

               }
           }
           res[i] = total;
           ++i;
       }

       return res;
   }
}
