package Circle_Area;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	static Double PI = 3.14159265358979323;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		Double S = 0.0;
		S = PI*r*r;
		DecimalFormat df = new DecimalFormat("0.0000000");
		System.out.println(df.format(S));
	}

}
