package CubicAnd;

public class Main {

	public static void main(String[] args) {
		for(int i = 100;i<1000;i++){
			int a = (i/100)*(i/100)*(i/100);
			int b = ((i%100)/10)*((i%100)/10)*((i%100)/10);
			int c = (i%10)*(i%10)*(i%10);
			if(i == (a+b+c)){
				System.out.println(i);
			}
		}
	}

}
