package Palindrome4;

public class Main {

	public static void main(String[] args) {
		for(int i = 1000;i<10000;i++){
			if((i/1000)==(i%10)&&((i/100)%10)==((i%100)/10)){
				System.out.println(i);
			}
		}

	}

}
