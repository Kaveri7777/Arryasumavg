package practice;

public class arraysum {

	public static void main(String[] args){
		int[] nums= {1,2,3,4,5};
		
		System.out.println("length: "+nums.length);
		
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
		}
		int avg=sum/ nums.length;
		int max=nums[0];
		int min=nums[0];
		
		for(int val:nums) {
			if(val>max)max=val;
			if(val<min)min=val;
		}
		System.out.println("Sum: "+sum);
		System.out.println("length: "+nums.length);
		System.out.println("Avg: "+avg);
		System.out.println("Max: "+max);
		System.out.println("Min:"+min);
		}
}	