package Board;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SignUp signup = new SignUp();
		inquiry inquiry = new inquiry();
		allInquiry allIn = new allInquiry();

		int num;

		while (true) {
			System.out.println("1 : 회원가입, 2 : 회원 정보 조회, 3 : 전체 회원 정보 조회, 4 : 서비스 종료");
			num = sc.nextInt();

			if (num == 1) {
				signup.addSignUp();
			}
			else if (num == 2) {
				inquiry.customerInquiry();
			}
			else if (num == 3) {
				allIn.allCustomerInquiry();
			}
			else if (num == 4) {
				break;
			}
			else {
				System.out.println("다시 입력하세요");
			}

		}
		System.out.println("이용해주셔서 감사합니다");
	}

}
