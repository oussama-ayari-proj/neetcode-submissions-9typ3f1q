class TimeMap {
    Map<String, List<Pair>> map;

    public TimeMap() {
        map=new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key))
            map.put(key,new ArrayList<>());
        map.get(key).add(new Pair(value,timestamp));
    }

    public String get(String key, int timestamp) {
        if(!map.containsKey(key))
            return "";
        return binarySearch(map.get(key),timestamp);
    }
    public String binarySearch(List<Pair> list,int timestamp){
        int n=list.size();
        String res="";
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+((high-low)/2);
            if(list.get(mid).timestamp>timestamp){
                high=mid-1;
            }else {
                res=list.get(mid).value;
                low=mid+1;
            }
        }
        return res;
    }
}

class Pair{
    String value;
    int timestamp;

    public Pair(String value, int timestamp) {
        this.value = value;
        this.timestamp = timestamp;
    }

    public String getValue() {
        return value;
    }

    public int getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "value='" + value + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}