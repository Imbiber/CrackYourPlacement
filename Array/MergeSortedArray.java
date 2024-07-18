package Array;

import java.util.Arrays;

public class MergeSortedArray {
 
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0,j=m;i<nums2.length;i++){
            nums1[j]=nums2[i];
            j++;
        }
        Arrays.sort(nums1);
        return ;
    }

}
