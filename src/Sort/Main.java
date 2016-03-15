package Sort;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int num = n,temp = 0;
		int array[] = new int[n];
		for(int i = 0;i<n;i++){
			array[i] = in.nextInt();
		}
		for(int i = 0;i<n;i++){
			for(int j = i+1;j<n;j++){
				if(array[i]<array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		while(num>0){
			System.out.print(array[num-1]);
			System.out.print(" ");
			num--;
		}
	}

}
