import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NameAge_Method {
	// 필드영역(전역변수)
	private String name;// 클래스의 멤버변수
	private int age;

	public String name_method() throws IOException {// 멤버함수
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("이름을 입력하세요: ");
		name = input.readLine();
		return name;
	}

	public int age_method() throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("나이를 입력하세요: ");

		age = Integer.parseInt(input.readLine());
		return age;
	}

	public void display_method() {

		// TODO Auto-generated method stub
		System.out.println(name + "님의 나이는 " + age + "세입니다.");
	}

	public static void main(String[] args) throws IOException {
		NameAge_Method nam = new NameAge_Method();
		nam.name_method();
		nam.age_method();

		nam.display_method();
	}

}

// 상속 : public class A extends B Implements C,D,E,F....{
// CDEF를 B에게 상속 그것을 A에게 최종 상속
//public class F implements G,H...{}