package Array;
import java.util.*;
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int i=0;
        int [] ans = new int[2];
        for (int num : nums){
            map.put(num , i );
            i++;
        }
        int j=0;
        for(int value:nums){
            int diff = target - value;
            if(map.containsKey(diff) && map.get(diff)!=j){
                ans[0]=j;
                ans[1]=map.get(diff);
                break;
            }
            j++;
           
        }
        return ans;   
    }
}
