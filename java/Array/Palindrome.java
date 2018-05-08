/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
package 数组;

import java.util.Scanner;

/**
 * @author 10251
 *
 */
public class Palindrome {

	/**
	 * 思路：变字符串，反转后再比较
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(isPalindrome(a));
	}

	public static boolean isPalindrome(int x) {
		String s = x + "";

		//		String是固定不变的，在进行字符串连接的时候是新建一个字符串，进行连接后，最后赋值，
		//		如果对String赋值多次，就会在内存中保存多个这个对象的副本，浪费系统资源
		//
		//		StringBuilder是可变的，不用生成中间对象，拼接字符串比较多，或字符串的长度比较长时有较高的效率。
		//		StringBuilder的内存空间不够也要扩容，如果分配的空间远远大于需要量，也很浪费
		//		所以，初始化StringBuilder的时候最好根据需要设置容量，避免浪费

		StringBuffer sb = new StringBuffer(s);
		sb = sb.reverse();//反转字符串

		int count = 0;//记录判断个数。

		for (int i = 0; i < s.length(); i++) {//判断是否相等
			if (s.charAt(i) != sb.charAt(i)) {

				return false;
				
			} else {
				count++;
			}
		}

		if (count != s.length()) {//判断长度是否相等

			return false;
		}

		return true;
	}
}
