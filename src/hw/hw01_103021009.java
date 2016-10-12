package hw;

/*
 * Topic: 1.輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。
 * Date: 2016/10/06
 * Author: 103021009 吳庭瑋
 */
import java.util.*;

public class hw01_103021009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int sum = 0;
		while (x >=10) {
			sum++;
			x = x / 10;
		}
		System.out.println(sum+1);
	}
}
