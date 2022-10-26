import java.util.Scanner;

public class Equation {

    public static void LinearEquation(double a, double b){
        if(a == 0){
            System.out.println("No solution.");
        }else{
            double x = -b/a;
            System.out.println("x = " + x);
        }
    }

    public static void LinearSystem(double a1, double b1, double c1, double a2, double b2, double c2){
        double D = a1*b2 - a2*b1;
        double Dx = c1*b2 - c2*b1;
        double Dy = a1*c2 - a2*c1;
        if(D==0 && Dx==0 && Dy==0){
            System.out.println("Infinitely many solution.");
        }else if(D == 0 && (Dx!=0 || Dy!=0)){
            System.out.println("No solution.");
        }else{
            double x = Dx/D;
            double y = Dy/D;
            System.out.println("x = " + x + "; y = " + y);
        }
    }

    public static void Quadratic(double a, double b, double c){
        double delta = b*b - 4*a*c;
        if(delta < 0){
            System.out.println("No solution.");
        }else if(delta == 0){
            double x = -b/(2*a);
            System.out.println("x = " + x);
        }else{
            double x1 = (-b + Math.sqrt(delta)) / (2*a);
            double x2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("x1 = " + x1 + "; x2 = " + x2);
        }
    }
    
    public static void main(String argv[]){
        Scanner sc = new Scanner(System.in);
        int k = 0;
        int choos;
        double a1, b1, a2, b2, c1, c2;
        while(k==0){
            System.out.println("------------------MENU----------------------");
            System.out.println("1. Linear Equation");
            System.out.println("2. Linear System");
            System.out.println("3. Quadratic Equation");
            System.out.println("4. OUT");
            System.out.print("\nYour choos: ");
            choos = sc.nextInt();
            System.out.println();
            switch (choos) {
                case 1:
                    System.out.print("a = ");
                    a1 = sc.nextDouble();
                    System.out.print("\nb = ");
                    b1 = sc.nextDouble();
                    LinearEquation(a1,b1);
                    break;

                case 2:
                    System.out.print("a1 = ");
                    a1 = sc.nextDouble();
                    System.out.print("b1 = ");
                    b1 = sc.nextDouble();
                    System.out.print("c1 = ");
                    c1 = sc.nextDouble();
                    System.out.print("a2 = ");
                    a2 = sc.nextDouble();
                    System.out.print("b2 = ");
                    b2 = sc.nextDouble();
                    System.out.print("c2 = ");
                    c2 = sc.nextDouble();
                    LinearSystem(a1,b1,c1,a2,b2,c2);
                    break;

                case 3:
                    System.out.print("a = ");
                    a1 = sc.nextDouble();
                    System.out.print("b = ");
                    b1 = sc.nextDouble();
                    System.out.print("c = ");
                    c1 = sc.nextDouble();
                    if(a1==0){
                        LinearEquation(b1,c1);
                    }else{
                        Quadratic(a1,b1,c1);
                    }
                    break;

                default:
                    k++;
                    break;
            }
        }
    }
    


}
