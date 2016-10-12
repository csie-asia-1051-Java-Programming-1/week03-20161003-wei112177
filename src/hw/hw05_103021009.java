package hw;

/*
 * Topic: 5.讓使用者輸入一正整數n，計算1(1+1) + 2(2+1) + 3(3+1) + … + n(n+1)並輸出結果。
 * Date: 2016/10/06
 * Author: 103021009 吳庭瑋
 */
import java.util.*;

public class hw05_103021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int x = 0, sum = 0;
		for (int i = 1; i <= n; i++) {
			x = i * (i + 1);
			sum += x;
		}
		System.out.println(sum);
	}

}
