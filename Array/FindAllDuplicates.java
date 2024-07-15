package Array;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {
     public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int[] ans = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            ans[nums[i]]+=1;
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i]>1) list.add(i);
        }
        return list;
    }
}
