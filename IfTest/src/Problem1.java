import java.io.IOException;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int data = 0;
		int alphabet = 0;
		int digit = 0;
		int con = 0;
		int other = 0;
		Scanner sc = new Scanner(System.in);
		while ((data = System.in.read()) != -1) {

			if (data >= 'A' && data <= 'Z' || data >= 'a' && data <= 'z') {
				alphabet++;
			} else if (data >= '0' && data <= '9') {
				digit++;
			} else if (data == '\t' || data == '\r' || data == '\n' || data == ' ') {
				con++;
			} else {
				other++;
			}
		}
		System.out.println("alphabet = " + alphabet);
		System.out.println(" digit = " + digit);
		System.out.println(" con = " + con);
		System.out.println("other = " + other);

	}

}
/*
 * 특수문자, 숫자, 알파벳 문자, 제어문자 등을 입력받아서 각 문자의 갯수를 출력하는 프로그램을 작성하세요.
 * 
 */
