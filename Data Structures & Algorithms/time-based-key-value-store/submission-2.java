class TimeMap {
    private Map<String,TreeMap<Integer,String>> store;

    public TimeMap() {
        store=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!store.containsKey(key)){
            TreeMap<Integer,String> val = new TreeMap<>();
            val.put(timestamp,value);
            store.put(key,val);
        }else{
           TreeMap<Integer,String> val = store.get(key);
           if(!val.containsKey(timestamp)){
            val.put(timestamp,value);
            store.put(key,val);
           }else{
            val.put(timestamp,value);
            store.put(key,val);
           }
        }
    }
    
    public String get(String key, int timestamp) {
        if(!store.containsKey(key)){
            return "";
        }
        TreeMap<Integer,String> times = store.get(key);
        Map.Entry<Integer,String> entry = times.floorEntry(timestamp);
        if(entry == null){
            return "";
        }
        return entry.getValue();
    }
}
