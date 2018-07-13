
//import java.io.*;
import java.util.Scanner;

public class SuInput {

	public static void main(String[] args) {
		// throws IOException {

		int a, b, c;

		String name;
		// BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		Scanner sc = new Scanner(System.in);
		/*
		 * a =Integer.parseInt(input.readLine()); b =Integer.parseInt(input.readLine());
		 * c = Integer.parseInt(input.readLine());
		 */
		System.out.println("이름을 입력하세요. ");
		name = sc.next();
		System.out.println("숫자를 입력하세요.");
		System.out.println("a : ");
		a = sc.nextInt();
		System.out.println("b : ");
		b = sc.nextInt();
		System.out.println("c : ");
		c = sc.nextInt();
		System.out.println(name + "이 입력한 수는 : " + a + ", " + b + ", " + c);
		System.out.println(name +"입력한 수의 합은 : " + (a + b + c));
	}
}
