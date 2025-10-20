import java.util.*;
public class BasicCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("----BASIC CALCULATOR----");
        System.out.print("Enter num1 :" );
        int num1 = sc.nextInt();
        System.out.print("Enter num2 :"  );
        int num2 = sc.nextInt();
        System.out.println("Enter the Operation to do :");
        int Addition = num1+num2;
        System.out.println("Addition of num1 and num2 :" + Addition);
        int Subtraction = num1-num2;
        System.out.println("Subtraction of num1 and num2 :" + Subtraction);
        for(int i=1;i<=10;i++){
            int Multiplication = num1 * i;
            System.out.println("Multiplication : "  +   num1  + " * " + i + " = " + Multiplication);
        }
        if(num2 != 0){
            int Division = num1/num2;
            System.out.println("Division of num1 and num2 :" + Division);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
      }
}