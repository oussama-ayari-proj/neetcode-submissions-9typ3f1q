public class Solution {
   public int FindDuplicate(int[] nums)
   {
        
              Dictionary<int, int> dic = new Dictionary<int, int>();
    for (var i = 0; i < nums.Length; i++)
    {
        if (dic.ContainsKey(nums[i]))
        {
            return nums[i];
        }
        else
        {
            dic[nums[i]] = nums[i];
        }
    }
    return -1; 
}


   
}
