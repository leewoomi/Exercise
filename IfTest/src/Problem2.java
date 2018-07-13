import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int k=100;
		int m=0;
		int n=0;
		
		
		while(k!=0) {
			m=num/k;
			n=num%k;
			num=n;
			System.out.println(m+"은 "+k+"의 자리");
			k=k/10;
			
		}
		
		
	}

}
/*
 * 주어진 숫자 단위 구하기
 * 예) 345면 3은 백의 자리, 4는 십의 자리, 5는 일의 자리
 * */
