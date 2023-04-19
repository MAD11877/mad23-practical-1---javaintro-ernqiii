import java.util.Scanner;

public class Question5 
{
  public static void main(String[] args) 
  {
    Scanner in = new Scanner(System.in);
    int numberof = in.nextInt();
    int[] nums = new int[numberof];
    for (int i = 0; i < numberof; i++) {
      //System.out.print("Enter integer: ");
      int num = in.nextInt();
      nums[i] = num;
    }
    int mode = 0;
    int maxCount = 0;
    for (int k = 0; k < nums.length; k++) {
      int count = 0;
      for (int j = 0; j < nums.length; j++) {
        if (nums[j] == nums[k]) {
          count++;
        }
      }
      if (count > maxCount) {
        maxCount = count;
        mode = nums[k];
      }
      
    }
    if (maxCount!= 0)
    {
      System.out.println(mode);
    }
    else
    {
      System.out.println("There is no mode");
    }

   
    in.close();
  }
}
