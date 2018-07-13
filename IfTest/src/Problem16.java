import java.util.Random;
import java.util.Scanner;

/*가위 바위 보 게임을 합니다.
 * 조건 : 난수를 발생하여 처리합니다.
 * Random()메소드 사용 
 * 사용법 : Random()메소드에서 객체를 생성하여 사용합니다. */
public class Problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rd =new Random();
	int c=	rd.nextInt(3)+1;
	//System.out.println(c);
	String c1;
	if(c==1) {
		c1="바위";
	}else if(c==2) {
		c1="가위";
	}else {
		c1="보";
	}
	Scanner sc = new Scanner(System.in);
	System.out.println("가위,바위, 보");
	String h = sc.next();
	System.out.println("컴퓨터 : "+c1 + "\n 당신 : "+h);
	switch(h) {
	
	case "바위":
		
		if(c1=="바위") {
			System.out.println("비겼습니다.");
		}else if(c1=="가위") {
			System.out.println("당신이 이겼습니다.");
		}else {
			System.out.println("당신이 졌습니다.");
		}
		break;
	case "가위":
		if(c1=="바위") {
			System.out.println("당신이 졌습니다.");
		}else if(c1=="가위") {
			System.out.println("비겼습니다.");
		}else {
			System.out.println("당신이 이겼습니다.");
		}
		break;
	case "보":
		if(c1=="바위") {
			System.out.println("당신이 이겼습니다.");
		}else if(c1=="가위") {
			System.out.println("당신이 졌습니다.");
		}else {
			System.out.println("비겼습니다.");
		}
		break;
		default:
			System.out.println("잘못 입력 하였습니다.");
			break;
	
		
	}

}

}
