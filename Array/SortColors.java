package Array;

public class SortColors {
   
        public void sortColors(int[] arr) {
            int n=arr.length;
            for(int i=0;i<n-1;i++){
                for(int j=0;j<n-1-i;j++){
                    if(arr[j]>arr[j+1])
                    swap(arr,j,j+1);
                }
            }
        }
        public void swap(int[]arr, int a , int b){
            int temp ;
            temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }
    
}
