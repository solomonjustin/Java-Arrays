public class Order {

	public static void main(String[] args) {
		
		int[] nums = {30, 50, 20};
		int minIndex, lowest, nextIndex, currentIndex;
		
		for (currentIndex = 0; currentIndex < nums.length; currentIndex++) {
			
			minIndex = currentIndex;	//min index that needs to be searched is the current position in loop
			lowest = nums[currentIndex]; //lowest equals the current element since the lowest element in array is already taken by least value
			
			for(nextIndex = currentIndex + 1; nextIndex < nums.length; nextIndex++){ //search array from index after current index
				
				if(nums[nextIndex] < lowest){
					lowest = nums[nextIndex];
					minIndex = nextIndex;
				}
				
			}
			
			nums[minIndex] = nums[currentIndex];
			nums[currentIndex] = lowest;
				
		}
		
		for(Integer i: nums)
			System.out.println(i);

	}

}
