import java.util.Scanner;

public class Binary_Search_3 {
    public static void main(String[] args) {
        // this is all about the ascending and descending order binary search
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array (Ascending/Descending) order:");
        int[] nums = new int[7];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target element:");
        int target = sc.nextInt();
        int res=binarySearch3(nums, target);
        System.out.println(res);
       
    }
    static int binarySearch3(int[] nums, int target){
        int start=0;
        int end=nums.length-1;
        if(nums[start]<nums[end]){
            return ascendingSearch(nums, target);
        }
        else{
            return descendingSearch(nums, target);
        }

    }

    static int ascendingSearch(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    static int descendingSearch(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start) / 2;
            if(target>nums[mid]){
                end=mid-1;
            }
            else if(target<nums[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

}
