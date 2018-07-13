package method;

public class Task {

	// Hello Java를 3번 출력해주는 메소드
	public void HelloJava3() {

		for (int i = 0; i < 3; i += 1) {
			System.out.println("Hello Java");
		}

	}

	// 1부터 100까지의 합을 출력해주는 메소드
	public void add(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("합계: " + sum);
	}

	// 1부터 100까지의 합을 return해주는 메소드
	public int add1() {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}

	// 로그인 처리 메소드
	public boolean login(String id, String password) {
		boolean result = false;
		if (id.equals("root") && password.equals("1234")) {
			result = true;
		}
		return result;
	}

	// 회원 탈퇴
	public boolean out(String id, String password) {

		boolean result = false;
		if (id.equals("root") && password.equals("1234")) {
			result = true;
		}
		return result;
	}
}
