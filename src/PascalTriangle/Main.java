package PascalTriangle;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [][]a = new int[n][n];
		a[0][0] = a[1][0] = a[1][1] = 1;
		for(int i = 0;i<n;i++){
			a[i][0] = 1;
		}
		for(int i = 0;i<n;i++){
			for(int j = 0;j<n;j++){
				if(i>=2&&j>=1){
					a[i][j] = a[i-1][j-1] + a[i-1][j];
				}
				if(a[i][j]!=0){
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

}
