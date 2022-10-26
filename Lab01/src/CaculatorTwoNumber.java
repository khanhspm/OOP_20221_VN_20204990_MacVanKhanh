import java.util.Scanner;

public class CaculatorTwoNumber {
    public static void main(String[] argv){
        String strNum1, strNum2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number1: ");
        strNum1 = sc.next();
        System.out.print("\nInput number2: ");
        strNum2 = sc.next();
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        sc.close();
        System.out.println("\nSum = " + (num1 + num2));
        System.out.println("Divs = " + (num1 - num2));
        System.out.println("Mul = " + (num1 * num2));
        System.out.println("Divd = " + (num1 / num2));
    }
}
