package ex;

import java.util.Scanner;

/*
 * Topic: 輸入一個字元，轉換其大小寫輸出 (大寫 ->小寫，小寫->大寫)
 * Date: 2016/10/03
 * Author: 103021009 吳庭瑋
 */

public class ex03_103021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char ch1 = scn.next().charAt(0);
		int a = ch1 + 32;
		if (a >= 97 && a <= 122) {
			System.out.println(String.valueOf(ch1).toLowerCase());
		} else {
			a = ch1 - 32;
			if (a >= 65 && a <= 90) {
				System.out.println(String.valueOf(ch1).toUpperCase());
			}
		}
	}
}
