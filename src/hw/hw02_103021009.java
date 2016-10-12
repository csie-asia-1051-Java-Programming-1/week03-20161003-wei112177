package hw;

/*
 * Topic: 2.讓使用者輸入多個數，統計正數、負數及零各有多少個。
 * Date: 2016/10/06
 * Author: 103021009 吳庭瑋
 */
import java.util.*;

public class hw02_103021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入6個數");
		int i = 0, j = 0, k = 0;
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		int d = scn.nextInt();
		int e = scn.nextInt();
		int f = scn.nextInt();

		if (a > 0) {
			i++;
		} else if (a == 0) {
			j++;
		} else if (a < 0) {
			k++;
		}

		if (b > 0) {
			i++;
		} else if (b == 0) {
			j++;
		} else if (b < 0) {
			k++;
		}

		if (c > 0) {
			i++;
		} else if (c == 0) {
			j++;
		} else if (c < 0) {
			k++;
		}

		if (d > 0) {
			i++;
		} else if (d == 0) {
			j++;
		} else if (d < 0) {
			k++;
		}

		if (e > 0) {
			i++;
		} else if (e == 0) {
			j++;
		} else if (e < 0) {
			k++;
		}
		
		if (f > 0) {
			i++;
		} else if (f == 0) {
			j++;
		} else if (f < 0) {
			k++;
		}
		System.out.println(i + "個正數");
		System.out.println(j + "個0");
		System.out.println(k + "個負數");
	}
}
