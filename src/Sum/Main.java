package Sum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		if(n%2==0){
			System.out.println((n+1)*(n/2));
		}else {
			System.out.println((n+1)*(n/2)+((n/2)+1));
		}

	}

}
