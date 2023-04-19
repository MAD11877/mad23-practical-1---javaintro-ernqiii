import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    int numberof = in.nextInt();
    int[] nums = new int[numberof];
    for (int i = 0;i <numberof ; i++)
    {
      scanner.out.println("Enter integer:");
      int num = in.nextInt;
      nums[i] = num;
    }
    int mode = 0;
        int maxCount = 0;
        for (int k = 0; k < nums.length; k++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[k]) 
                {
                    count++;
                }
            }
            if (count > maxCount) 
            {
                maxCount = count;
                mode = nums[k];
            }
        }
        
       
        System.out.println("The mode is: " + mode);


  }
}
