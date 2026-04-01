class Solution {
    public boolean isAnagram(String s, String t) {
        char[] tabS=s.toCharArray();
        char[] tabT=t.toCharArray();
        Arrays.sort(tabS);
        Arrays.sort(tabT);
        System.out.println(Arrays.toString(tabS));
        return Arrays.toString(tabS).equals(Arrays.toString(tabT));
    }
}
