package ex;

/*
 * Topic: 輸入一個字元，判斷是大寫或小寫或是其他字元。
 * Date: 2016/10/03
 * Author: 103021009 吳庭瑋
 */
import java.util.*;

public class ex02_103021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		char ch1 = scn.next().charAt(0);
		int a = ch1 - 'a';
		if (a >= 0 && a < 26) {
			System.out.println("小寫");
		} else {
			a = ch1 - 'A';
			if (a >= 0 && a < 26) {
				System.out.println("大寫");
			}
		}

	}

}
