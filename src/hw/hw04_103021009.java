package hw;

/*
 * Topic: 4.讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/06
 * Author: 103021009 吳庭瑋
 */
import java.util.*;

public class hw04_103021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i = 1, sum = 1;
		while (i <= n) {
			sum *= i;
			i++;
		}
		System.out.println(sum);
	}
}
