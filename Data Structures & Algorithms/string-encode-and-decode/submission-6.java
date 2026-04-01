class Solution {

    public String encode(List<String> strs) {
        StringBuilder res=new StringBuilder();
        for(String s : strs){
            res.append(s.length());
            res.append("#");
            res.append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res=new ArrayList<>();
        int i=0;
        int n=str.length();
        while(i<n){
            int j=i;
            while(str.charAt(j)!='#') j++;
            int length=Integer.parseInt(str.substring(i,j));
            i=j+length+1;
            res.add(str.substring(j+1,i));
        }
        return res;
    }
}
