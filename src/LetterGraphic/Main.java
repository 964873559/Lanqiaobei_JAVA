package LetterGraphic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rows = in.nextInt();
		int cols = in.nextInt();
		int [][]a = new int[rows][cols];
		if(rows <= cols){
			for(int i = 0;i<rows;i++){
				a[i][i] = 65;
				for(int j = i+1;j<cols;j++){
					a[i][j] = a[i][j-1] + 1;
				}
				for(int j = i-1;j>=0;j--){
					a[i][j] = a[i][j+1] + 1;
				}
			}
		}else {
			for(int i = 0;i<cols;i++){
				a[i][i] = 65;
				for(int j = i+1;j<cols;j++){
					a[i][j] = a[i][j-1] + 1;
				}
				for(int j = i-1;j>=0;j--){
					a[i][j] = a[i][j+1] + 1;
				}
			}
			for(int i = cols;i<rows;i++) {
				for(int j = 0;j<cols;j++){
					a[i][j] = a[i%cols][j];
				}
			}
		}
		for(int i = 0;i<rows;i++){
			for(int j = 0;j<cols;j++){
				System.out.print((char)a[i][j]);
				
			}
			System.out.println();
		}
	}

}
