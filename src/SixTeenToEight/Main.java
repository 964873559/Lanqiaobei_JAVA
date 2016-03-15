package SixTeenToEight;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String num[] = new String[n];
		long temp[] = new long[n];
		for(int i = 0;i<n;i++){
			num[i] = in.next();
		}
		for(int i = 0;i<n;i++){
			temp[i] = Integer.parseInt(num[i], 16);
		}
		for(int i = 0;i<n;i++){
			System.out.println(Long.toString(temp[i], 8));
		}
	}

}
