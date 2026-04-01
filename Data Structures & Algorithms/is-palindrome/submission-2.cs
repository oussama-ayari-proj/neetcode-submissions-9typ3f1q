public class Solution {
    public bool IsPalindrome(string s) {

 s = Regex.Replace(s, "[^a-zA-Z0-9]", String.Empty);
 Console.WriteLine( "sting ===>",s );
 var right = s.Length-1;
 var left = 0;
 bool res = true;
 while (right > left)
 {
     Console.WriteLine(s[right]);
     if (s[right].ToString().ToLower() != s[left].ToString().ToLower())
     {
   
         res = false;
         Console.WriteLine(s[right]);
         Console.WriteLine(s[left]);
         break;

     }
     left++;
     right--;
 }

 return res;
    }
}