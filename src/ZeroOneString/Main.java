package ZeroOneString;

public class Main {

	public static void main(String[] args) {
		for(int i = 0;i<32;i++){
			System.out.println(String.format("%5s", Integer.toString(i, 2)).replace(" ", "0"));
		}

	}

}
