class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String s : strs){
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res=new ArrayList<>();
        int i=0;
        int n=str.length();
        while(i<n){
            int j=i;
            while(str.charAt(j)!='#')
                j++;
            int length=Integer.valueOf(str.substring(i,j));
            String s=str.substring(j+1,j+length+1);
            res.add(s);
            i=j+length+1;
        }
        return res;
    }
}
