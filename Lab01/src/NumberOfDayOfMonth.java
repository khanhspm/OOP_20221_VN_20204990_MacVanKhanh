
import java.util.Scanner;
public class NumberOfDayOfMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] month_compare = new String[12];
		month_compare[0] = "January Jan. Jan 1";
		month_compare[1] = "February Feb. Feb 2";
		month_compare[2] = "March Mar. Mar 3";
		month_compare[3] = "April Apr. Apr 4";
		month_compare[4] = "May 5";
		month_compare[5] = "June Jun 6";
		month_compare[6] = "July Jul 7";
		month_compare[7] = "August Aug. Aug 8";
		month_compare[8] = "September Sep. Sep 9";
		month_compare[9] = "October Oct. Oct 10";
		month_compare[10] = "November Nov. Nov 11";
		month_compare[11] = "December Dec. Dec 12";
		System.out.print("Month: ");
		String str_month = sc.next();
		int month = 0;
		for(int i = 0; i < 12; i++){
			if(month_compare[i].contains(str_month) == true){
				month = i+1;
			}
		}
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
