package Palindrome56;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = in.nextInt();
		int num = 0;
		for(int i = 10000;i<100000;i++){
			if((i/10000)==(i%10)&&((i/1000)%10)==((i%100)/10)){
				num = (i/10000)*2 + ((i/1000)%10)*2 + (i%1000)/100;
				if(num == sum){
					System.out.println(i);
				}
			}
		}
		for(int i = 100000;i<10000000;i++){
			if((i/100000)==(i%10)&&((i%100000)/10000)==((i%100)/10)&&((i/1000)%10)==((i%1000)/100)){
				num = (i/100000)*2 + ((i%100000)/10000)*2 + ((i/1000)%10)*2;
				if(num == sum){
					System.out.println(i);
				}
			}
		}
		
	}

}
