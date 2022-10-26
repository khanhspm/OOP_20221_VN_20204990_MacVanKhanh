
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char c ='*';
		int count = 0;
		while(count < n) {
			for(int i = 1; i <= 1+count*2; i++) {
				System.out.print(c);
			}
			System.out.print("\n");
			count++;
		}
		sc.close();

	}

}
