package in.mixedtypeProblems;

public class Solution {
	
	

	 public int[] twoSum(int[] nums, int target) {

		int nums = [2,7,11,15]; 
				 
				int target = 9;
	        int n= nums.length;
	        for(int i= 0; i<n-1; i++){
	            for (int j= i+1;j<n; j++){
	                if (nums[i] + nums[j] == target){
	                    return new int[]{i,j};

	                }
	            }
	        }
	        return new int[]{};
	    }
	
}
