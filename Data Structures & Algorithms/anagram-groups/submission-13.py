class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        res={}
        for s in strs:
            sorted_chars=sorted(s)
            anagram = ""
            for c in sorted_chars:
                anagram = anagram + c
            if not anagram in list(res.keys()):
                res[anagram]=[]
            res[anagram].append(s)
        
        return list(res.values())