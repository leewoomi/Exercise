
import java.io.*;
import java.util.Scanner;


/*입력된 문자가 대문자이면 
 * 소문자로 변경하는 프로그램을 작성하세요.
 * */
public class Problem12 {



	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int A=0;
		System.out.println("A : ");
		A=System.in.read();
		
		if(A>='A' && A<='Z') {
			A=A+32;
			System.out.println((char)A);
		}
		else if(A>='a' && A<='z') {
			A=A-32;
			System.out.println((char)A);
		}
		
		int a;
		Scanner sc =new Scanner(System.in);
		System.out.println("a : ");
		a=sc.next().charAt(0);
		
		
		
		if(a>='A' && a<='Z') {
			a=a+32;
			System.out.println((char)a);
		}
		else if(a>='a' && a<='z') {
			a=a-32;
			System.out.println((char)a);
		}
	}



}
