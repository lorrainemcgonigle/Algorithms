
public class InsertionSort {

	 public static void main(String[] args) 
	    {
	        int [] numbers = {2, 5, 90, 7, 6, 88, 45, 11, 999, 23, 1};
	        insertionSort(numbers);
	        for (int x = 0; x < numbers.length; x++)
	        {
	            System.out.print(numbers[x] + " ");
	        }
	    }
	 //method below to sort the array
	    public static void insertionSort(int [] nums)
	    {
	        for (int j = 1; j < nums.length; j++)
	        {
	            int key = nums[j];//set key to the value in nums[j]
	            int i = j-1;//i starts at 0
	            while ((i > -1) && (nums[i] > key))//as long as i is 0 or more, and the value in nums[i] > key
	            {
	                nums[i+1] = nums[i];//swap
	                i--;//decrement i
	            }
	            nums[i+1] = key;//replace nums[i+1] with the value in key(set at nums[j])
	        }
	    }

}
