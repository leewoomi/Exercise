/*메소드를 이용하여 가감승제산을 하는 
 * 프로그램을 작성하세요.
 * 메소드 규칙 4가지중에서 하나를 선택하여 코딩해주세요. 
 * 메소드 이용 2번째 개념 도입.
 */

import java.util.Scanner;

public class Problem9_3 {

	int add=0, subtract=0, multiply=0, divide1=0, divide2=0;
	 
	public static void TitleDraw(boolean title) {
		if(title == true) {
			System.out.println("=====가감승제산 프로그램=====");
			System.out.print("| 두 개의 정수를 입력해 주세요.^^ | ");
			System.out.println("");
			System.out.println("=======================");
		}
		System.out.println("=======================");
	}
		
	 private void add(int su1, int su2) {
		 add = su1 + su2;
		 System.out.printf("합계는 = %d\n", add);
		}
	 
	 private void sub(int su1, int su2) {
			subtract = su1 - su2;
			System.out.printf("차는 = %d\n", subtract);
		}
	 
	 private void mul(int su1, int su2) {
		 multiply = su1 * su2;
		 System.out.printf("곱셈은 = %d\n", multiply);
		}
	 
	 private void div1(int su1, int su2) {
		 divide1 = su1 / su2;
		 System.out.printf("몫은 = %d\n", divide1);
			
		}
	 
	 private void div2(int su1, int su2) {
		 divide2 = su1 % su2;
		 System.out.printf("나머지는 = %d\n", divide2);
		}
	 
	public static void main(String[] args) {
		int su1, su2;
		TitleDraw(true);
		
		Problem9_3 number = new Problem9_3();
		Scanner sc = new Scanner(System.in); 
		su1 = sc.nextInt();
		su2 = sc.nextInt();	
				
		number.add(su1, su2);
		number.sub(su1, su2);
		number.mul(su1, su2);
		number.div1(su1, su2);
		number.div2(su1, su2);		
		
		TitleDraw(false);
	}
}
