class Solution {

    public String encode(List<String> strs) {
        StringBuilder str = new StringBuilder();
        for(String s : strs){
            str.append(s.length()).append("#").append(s);
        }
        System.out.println(str.toString());
        return str.toString();
    }
    //"Hello","World"
    // 5#Hello5#World
    //  j=i=0
    //  j++ , 1
    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();
        var i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j)!='#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            i=j+1;
            j=i+len;
            String curr = str.substring(i,j);
            System.out.println(curr);
            output.add(curr);
            i=j;
        }
        return output;
    }
}
