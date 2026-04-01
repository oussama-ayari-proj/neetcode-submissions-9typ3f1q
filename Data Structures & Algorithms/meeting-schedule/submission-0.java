/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals,(a,b)-> a.start-b.start);
        int n=intervals.size();
        for(int i=1;i<n;i++){
            Interval cur=intervals.get(i);
            Interval prev=intervals.get(i-1);
            if(cur.start<prev.end || prev.end > cur.start)
                return false;
        }
        return true;
    }
}
