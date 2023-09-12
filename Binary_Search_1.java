import java.util.Scanner;

public class Binary_Search_1 {
    public static void main(String[] args) {
        // This is all about Binary Search algorithm using java Programming language:
        int[] nums={-3,-2,0,12,34,90,109,200};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the target element:");
        int target=sc.nextInt();
        int ans=binarySearch(nums, target);
        System.out.println("The Index is : "+ ans);

    }
    static int binarySearch(int[]  arr,int target){
        if(arr.length==0){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
// Find the mid index of the array
    int mid=(start+end) /2;
    
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
