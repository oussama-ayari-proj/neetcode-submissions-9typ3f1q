public class Solution {
    public List<List<string>> GroupAnagrams(string[] strs) {
    
            List<List<string>> res = new List<List<string>>();
            List<string> sortedStrings = new List<string>();
            Dictionary<string,List<string>> dic = new Dictionary<string,List<string>>();
            List<string> group = new List<string>();
            foreach (var str in strs)
            {
                // Sort the characters of the string
                char[] charArray = str.ToCharArray();
                Array.Sort(charArray);

                // Convert the sorted characters back to a string
                string sortedStr = new string(charArray);

                // Add the sorted string to the list
                sortedStrings.Add(sortedStr);
                 
            }
            //pointing after conversion 
            var strs2 = sortedStrings.ToArray(); 
            for (int i = 0;i< strs2.Length; i++)
            {



                if (!dic.ContainsKey(strs2[i]))
                {

                    dic.Add(strs2[i], new List<string>() { strs[i] });
                }

                else
                {
                    dic[strs2[i]].Add(strs[i]) ;
                }
            

         
            }


            foreach (var str in dic)
            {

                List<string> strings = str.Value;
                res.Add(strings);

            }
            return res ;
        }
    
    
    
}
