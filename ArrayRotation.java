package DSA;

public class ArrayRotation {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        int d = 2;
        int n = nums.length;
        //for(int i=0;i<nums.length;i++){
        //    if(d+i<nums.length){
        //        nums[i] = nums[d+i];
        //   }
        //}
        for(int i=0;i<d-1;i++){
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }
        int j = 1;
        for(int i=d;i<n-d-1;i++){
            int temp = nums[i];
            nums[i] = nums[n-j];
            nums[n-j]= temp;
            j++;
        }
        for(int i=0;i<n/2;i++){
            int temp = nums[i];
            nums[i] = nums[n-i-1];
            nums[n-i-1] = temp; 
        }
        for(int num : nums){
            System.out.print(num);
        }
    }
}