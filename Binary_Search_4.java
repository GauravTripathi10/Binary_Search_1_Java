import java.util.Scanner;

public class Binary_Search_4 {
    public static void main(String[] args) {
        // Return the even number of Digits
        Scanner sc=new Scanner(System.in);
        int[] nums=new int[5];
        System.out.println("Enter the elemet in array in Ascending order:");
        for(int i=0;i<nums.length-1;i++){
            nums[i]=sc.nextInt();
        }
        int ans=digitEvenCount(nums);
        System.out.println(ans);
        
    }
    static int digitEvenCount(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int res=digitCount(num);
        if(res%2==0){
            return true;
        }
        else {
            return false;
        }

    }
    static int digitCount(int num){
        int cnt=0;
        while(num>0){
            num=num/10;
            cnt++;
        }
        return cnt;
    }
    
}
