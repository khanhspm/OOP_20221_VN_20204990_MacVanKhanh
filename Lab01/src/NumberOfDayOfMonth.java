import java.util.Scanner;
public class NumberOfDayOfMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Month: ");
		int month = sc.nextInt();
		System.out.print("\nYear: ");
		int year = sc.nextInt();
		sc.close();
		int[] arrMonth_31 = {1,3,5,7,8,10,12};
		System.out.print("The number of days of " + month + "/" + year + " is ");
		for(int i = 0; i < arrMonth_31.length; i++) {
			if(month == arrMonth_31[i]) {
				System.out.print("31");
				System.exit(0);
			}
		}
		if(month == 2) {
			if(year%4!=0) {
				System.out.print("28");
				System.exit(0);
			}
			else {
				if(year%100==0 && year%400 != 0) {
					System.out.print("28");
					System.exit(0);
				}
				else System.out.print("29");
			}
		}
		else System.out.print("30");
	}
 
}
