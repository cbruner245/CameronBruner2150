
/**
* Class name: ReviewProgram.java
* author Cameron Bruner
* collaborator: Dr. Hyesung Park
* Date August 11, 2022
* version 1.1
* description: This program will generate some examples from the ITEC 2140 course
*/


import.java.util.scanner
public class review program //class name starts with an uppercase
{
  
  public static void main(String[] args)
  {
      System.out.println("Enter two numbers");
      Scanner input = new Scanner(System.in);
      int number1 = input.nextInt();
      int number2 = input.nextINT();
      
      int result = rp.add(number1, number2);
      System.out.println("Result of two numbers " + number1 + " and " + number2 + " is " + result);
      
      int resultStatic = addStatic(number1, number2);
    
  }
  
  public int add(int firstNum, int secondNum) //instance method/non-static method
  {
    
  }
}
