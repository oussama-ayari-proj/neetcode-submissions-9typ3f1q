public class Solution {
    public int[] TopKFrequent(int[] nums, int k) {

        
            List<int> res = new List<int>();
            Dictionary<int, int> dic = new Dictionary<int, int>();
            foreach (int num in nums)
            {
                if (!dic.ContainsKey(num))
                {
                    dic.Add(num, 1);
                }
                else
                {
                    dic[num] = dic[num] + 1;
                }


            }

             var newdic = dic.OrderByDescending(x => x.Value);


            foreach (var item in newdic)
            {
                res.Add(item.Key);
            }

            return res.Take(k).ToArray();
        
    }
}
