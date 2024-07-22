import java.util.ArrayList;
import java.util.List;
import java.util.*;
class Solution {
    public boolean isPossible(long a[], long b[], int n, long k) {
        // Your code goes here
        Arrays.sort(a);
        List<Long> bList = new ArrayList<>();
        for (long num : b) {
            bList.add(num);
        }
        Collections.sort(bList, Collections.reverseOrder());
        for(int i=0;i<n;i++){
            if(a[i]+bList.get(i)<k) return false;
        }
        return true;
    }
}