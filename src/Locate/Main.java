package Locate;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int []a = new int[n];
		for(int i = 0;i<n;i++){
			a[i] = in.nextInt();
		}
		int num = in.nextInt();
		for(int i = 0;i<n;i++){
			if(a[i]==num){
				System.out.println(i+1);
				return;
			}
		}
		System.out.println(-1);
	}
}
