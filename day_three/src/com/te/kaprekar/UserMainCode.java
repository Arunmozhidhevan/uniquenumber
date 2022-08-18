package com.te.kaprekar;

public class UserMainCode {

	static int getKaprekarNumber(int n) {

		int x = n * n;
		int y = n * n;
		int count = 0;
		int right = 0;
		int left = 0;
		int z = 1;
		int result = 0;
		while (x > 0) {
			int rem = x % 10;
			count++;
			x = x / 10;
		}
	
		for (int i = 1; i <= (count / 2); i++) {
			z = z * 10;
		}
		left = y % z;
		System.out.println(left);
		right = y / z;
		System.out.println(right);

		if (left + right == n)
			return 1;
		else
			return -1;
	}

}
