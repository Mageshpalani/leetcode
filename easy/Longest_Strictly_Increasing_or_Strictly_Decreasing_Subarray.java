//3105. Longest Strictly Increasing or Strictly Decreasing Subarray
package easy;

import java.util.Scanner;

public class Longest_Strictly_Increasing_or_Strictly_Decreasing_Subarray {
	
	public static int longsubarray(int[] nums) {
		int inc=1;
		int dec=1;
        int lon=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                inc++;
                dec=1;
            }else if(nums[i]<nums[i-1]){
                inc=1;
                dec++;
            }else{
                inc=1;
                dec=1;
            }
            lon=Math.max(lon,Math.max(inc,dec));
        }
        return lon;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements: ");
		int a=sc.nextInt();
		
		int[] nums=new int[a];
		System.out.println("enter the elements of the array: ");
		for(int i=0;i<a;i++) {
			nums[i]=sc.nextInt();
		}
		int result=longsubarray(nums);
		System.out.println("Longest Strictly Increasing or Decreasing Subarray Length: "+ result);
		sc.close();
	}

}
