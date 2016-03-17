package LeapYear;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		if(year%4==0){
			if(year%100!=0){
				System.out.println("yes");
			}else if(year%400==0){
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}else{
			System.out.println("no");
		}
	}

}
