
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Input height of triangle: ");
		int n = sc.nextInt();      // input n  (height of triangle)
        sc.close();
		String c = "* ";
		int count = 0;
		for(int i = 1; i <= n; ++i, count = 0){      // println 
            for(int space = 1; space <= n-i; ++space){    // loop from 1 to n - 1 --> print space (2 space)
                System.out.print("  ");                
            }
            while(count != 2*i-1){      //  print '*'
                System.out.print(c);
                ++count;
            }
            System.out.println();
        }

	}

}
