package Board;

import java.util.Scanner;

public class SignUp {
	Scanner sc = new Scanner(System.in);
	
	
	public void addSignUp() {
		System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		
		System.out.println(name);
	}

}
