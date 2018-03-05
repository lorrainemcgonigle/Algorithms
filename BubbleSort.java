
public class BubbleSort {

    public static void main(String[] args) 
    {
        int [] numbers = {4, 6, 7, 1, 3, 4, 7, 9, 11, 44};
        for (int x = 0; x < numbers.length; x ++)
        {
            System.out.print(numbers[x] + " ");
        }
        bubbleSort(numbers);
        System.out.println();
        for (int y = 0; y < numbers.length; y++)
        {
            System.out.print(numbers[y] + " ");
        }
    }
    public static void bubbleSort(int [] nums)
    {
        int temp = 0;
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = 1; j < nums.length; j++)
            {
                if (nums[j-1] > nums[j])
                {
                    temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

}
