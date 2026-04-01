public class Solution {
        public bool IsValid(string s)
        {
            bool res = true;
            Dictionary<char,char> dic = new Dictionary<char,char>();
            dic.Add('(', ')');
            dic.Add('{', '}');
            dic.Add('[', ']');
            Stack<char> stack = new Stack<char>();
            for (int j = 0; j < s.Length; j++)
            {

                if (dic.ContainsKey(s[j]))
                {
                    stack.Push(dic[s[j]]);
                } 

                else if( stack.Count==0 || s[j]!=stack.Pop())
                {
                    return false;

                }   

            }
            return stack.Count ==0;




            return res;
        }
}