
public class IfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year =2004;
		if(year%2==0) {//나머지가 0이면 짝수 해
			System.out.println(year + "는 짝수 해 입니다.");
		}else {
			System.out.println(year + "는 홀수 해 입니다.");
		}
		
		if(year% 2 !=1) {//나머지가 1이 아니면 짝수 해
			System.out.println(year +"는 짝수 해 입니다." );
		}else {
			System.out.println(year + "는 홀수 해 입니다.");
		}
		
		if((year % 4==0) && (year % 100!=0) || (year % 400==0)) {
			//4로 나눈 나머지가 0이고 100으로 나눈 나머지가 0이 아니거나 400으로 나눈 나머지가 0이다.
			System.out.println(year+"는 윤년입니다.");
		}else {
			System.out.println(year+"는 윤년이 아닙니다.");
		}
	}
}
