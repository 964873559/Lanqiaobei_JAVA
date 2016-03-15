package SixTeenToTen;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String num = new String();
		num = in.next();
		System.out.println(Integer.parseInt(num, 16));
	}

}
