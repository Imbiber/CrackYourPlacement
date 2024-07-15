package Array;

public class FindtheDuplicateNumber{

    public int findDuplicate(int[] nums) {
        int[] ans = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            ans[nums[i]]+=1;
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i]>1) return i;
        }
        return -1;
    }
 }
