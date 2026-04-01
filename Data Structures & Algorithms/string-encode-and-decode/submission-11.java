class Solution {

    public String encode(List<String> strs) {
        StringBuilder output = new StringBuilder();
        for(String s : strs){
            output.append("#").append(s.length()).append("#").append(s);
        }
        return output.toString();
    }

    public List<String> decode(String str) {
        char[] arr = str.toCharArray();
        int i = 0;
        List<String> list = new ArrayList<>();
        while(i<arr.length){
            if(arr[i]=='#'){
                i++;
                StringBuilder sb = new StringBuilder();
                while(arr[i]!='#'){
                    sb.append(arr[i]);
                    i++;
                }
                Integer currLength = Integer.parseInt(sb.toString());
                i++;
                StringBuilder toAdd = new StringBuilder();
                while(currLength>0){
                    toAdd.append(arr[i]);
                    i++;
                    currLength--;
                }
                list.add(toAdd.toString());
            }else{
                i++;
            }
        }
        return list;
    }
}
