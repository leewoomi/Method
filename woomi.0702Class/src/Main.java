//Person이라는 클래스를 생성
class Person {
	int num;
	String name;
	int age;

	// static 변수 -공유
	static String schoolName;

	//TEN이라는 변수는 10을 저장 : 변경할 수 없다.
	static int x = 10;//읽고 쓰기 가능                              
	static final int TEN= x;//읽기 전용
}

public class Main {

	public static void main(String[] args) {
		//Person.TEN = 20;//The final field Person.TEN cannot be assigned

		Person person1 = new Person();
		Person person2 = new Person();

		System.out.println("person1:" + person1.age);
		System.out.println("person2 : " + person2.age);

		person1.age = 20;

		System.out.println("person1:" + person1.age);
		System.out.println("person2 : " + person2.age);

		Person.schoolName = "서울신화초등학교";
		System.out.println("person1:" + person1.schoolName);
		System.out.println("person2 : " + person2.schoolName);
		// static은 하나만 만들어서 공유 때문에 누군가가 변경하면 다른 모두에게 영향을 미침.

		// Person클래스의 객체생성
		Person p = new Person();

		// 인스턴스 이름을 출력하면 toString()이라는 메소드의 결과가 호출
		// 보통은 클래스 이름고 해시코드가 출력
		// 실패하면 null 아니면 예외발생
		System.out.println(p);
		// ->Person@139a55

		// Hello Java를 3번 출력하는 작업
		for (int i = 0; i < 3; i += 1) {
			System.out.println("Hello Java");
		}

	}
}
// 클래스를 만들고 그 클래스를 사용하기 위해서 인스턴스를 만들기
// new 생성자();
// ==>생성자 이름은 클래서 이름과 같다
// =>new를 이용해서 생성자를 호출하면 생성자를 가지고 인스턴스를 만들고 그 주소를 리턴한다.
// 보통은
// 클래스명 참조변수 = new 생성자();
/*
 * 변수(variable) 1.local variable(지역변수) 2. instance variable(멤버 변수)
 * 
 * 3.static variable(정적 변수) 무조건 1개만 생성 한번 만들면 프로그램이 종료될 때 까지 메모리에 유지가 됨 여러곳에서
 * 공유할 목적으로 생성 클래스 이름으로 호출해도 되고 객체 이름으로 호출해도 됨 객체 이름으로 호출하면 Eclipse에서 경고
 */
