class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for(String s : strs){
            encoded.append(s.length()).append('#').append(s);
        }
        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.valueOf(str.substring(i,j));
            i=j+1;
            j=i+len;
            list.add(str.substring(i,j));
            i=j;
        }
        return list;
    }
}
