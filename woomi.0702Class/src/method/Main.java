package method;

public class Main {

	public static void main(String[] args) {
		// Task 클래스의 인스턴스를 생성
		Task task = new Task();
		// 메소드 호출
		task.HelloJava3();
		System.out.println("Hello C++");
		// 메소드 호출
		task.HelloJava3();

		/*
		 * //Hello Java 3번 for(int i=0;i<3;i+=1) { System.out.println("Hello Java"); }
		 * //Hello C++ 1번 System.out.println("Hello C++");
		 * 
		 * //Hello Java 3번 for(int i=0;i<3;i+=1) { System.out.println("Hello Java"); }
		 */

		// 1부터 100까지의 합 메소드 호출
		task.add(100);//1부터 100까지
		new Task().add(50);//1부터 50까지

		int result = new Task().add1();
		// int result = 5050;
		System.out.println(result);
		result = result + 1;
		//result=5050+1=5051;
		System.out.println(result);
		
		boolean login =new Task().login("root", "1234");
		if(login == true){
			System.out.println("성공");
		}else {
			System.out.println("없는 아이디이거나 비밀번호가 틀렸습니다.");
		}
		
		boolean out = new Task().out("root", "1234");
		if(out == true){
			System.out.println("성공");
		}else {
			System.out.println("없는 아이디이거나 비밀번호가 틀렸습니다.");
		}
		
		int[] ar = {10,20,30};//배열은 reference형
		int[] br =ar;
		br[0]=70;
		System.out.println(ar[0]);
	}

}
