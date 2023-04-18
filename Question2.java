import java.util.Scanner;

public class MyMainProgram {

  public static void main(String[] args) {
    // call the method that calculates the user's BMI
    calculateBMI();
  }

  public static void calculateBMI() {
    Scanner in = new Scanner(System.in);
    System.out.print("Input height in meters: ");
    double height = in.nextDouble();
    System.out.print("Input weight in kilogram: ");
    double weight = in.nextDouble();
    double BMI = weight / (height * height);
    System.out.print("The BMI is " + BMI);
    in.close();
  }
}

