import java.util.HashSet;

class Solution {
    public int findPair(int n, int x, int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for(int a : arr ){
            if(set.contains(x+a)||set.contains(a-x)) return 1;
            set.add(a);
        }
        return -1;
    }
}
