import java.util.Scanner;

public class Binary_Search_2 {
    public static void main(String[] args) {
        // This is Binary Search algorithm
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter shorted array:");
        int[] nums=new int[7];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the target element:");
        int target=sc.nextInt();
        int res=binarySearch2(nums, target);
        System.out.println("The index is: " + res);
    }
    static int binarySearch2(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    
}
