package day3;

public class program {
	public class FindDuplicate {
	    public static int findDuplicate(int[] nums) {
	        // Using Floyd's Tortoise and Hare (Cycle Detection)
	        int slow = nums[0];
	        int fast = nums[0];
	        
	        // Phase 1: Find the intersection point of the two runners.
	        do {
	            slow = nums[slow];
	            fast = nums[nums[fast]];
	        } while (slow != fast);
	        
	        // Phase 2: Find the entrance to the cycle.
	        slow = nums[0];
	        while (slow != fast) {
	            slow = nums[slow];
	            fast = nums[fast];
	        }
	        
	        return slow;
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {3, 1, 3, 4, 2};
	        System.out.println("Duplicate number is: " + findDuplicate(nums)); // Output: 3
	    }
	}


}
