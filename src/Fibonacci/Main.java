package Fibonacci;

import java.io.IOException;
import java.util.Scanner;  
public class Main {  
    public static void main(String[] args) throws IOException{  
    	
    	Scanner scan = new Scanner(System.in);
    	int n = scan.nextInt();
        int f1=1,f2=1,f3=0;  
        if(n<3){  
            System.out.print("1");  
            return;}  
        for(int i=3;i<=n;i++)  
        {
        	if(f1>10007)f1=f1%10007;  
        	if(f2>10007)f2=f2%10007;  
        	f3=f1+f2;  
        	f1=f2;  
        	f2=f3;  
        }  
        System.out.print(f3%10007);  
        }  
          
} 