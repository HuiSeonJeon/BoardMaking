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
			System.out.println("1 : ȸ������, 2 : ȸ�� ���� ��ȸ, 3 : ��ü ȸ�� ���� ��ȸ, 4 : ���� ����");
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
				System.out.println("�ٽ� �Է��ϼ���");
			}

		}
		System.out.println("�̿����ּż� �����մϴ�");
	}

}
