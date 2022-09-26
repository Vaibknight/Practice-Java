package vaibhav;

import java.text.SimpleDateFormat;  
import java.util.Date;

public class days {
	
	public static int setBit(int n, int i) {
		int bitMask = 1<<i;
		return n | bitMask;
	}
	
	public static int clearBit(int n, int i) {
		int bitMask = ~(1<<i);
		return n&bitMask;
	}
	
	public static int updateBit(int n, int i, int newBit) {
		if(newBit == 0) {
			return clearBit(n,i);
		}
		else {
			return setBit(n,i);
		}
	}
	
	public static int cleariBit(int n, int i) {
		int bitMask = (-1)<<i;
		return n & bitMask;
	}
	
	public static int bitRange(int n , int i, int j) {
		int a = (~0) << j+1;
		int b = (1<<i)-1;
		
		int bitMask = a | b;
		
		return n & bitMask;
	}
	
	public static boolean two(int n) {
		return (n&(n-1)) == 0;
	}
	
	public static int countBit(int n, int a) {
		int ans = 1;
		
		while (n > 0) {
			if((n & 1) != 0) {
				ans = ans *a;
			}
			a*=a;
			n = n>>1;
		}
		return ans;
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(countBit(3,5));
	}

}
