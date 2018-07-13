package method1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method1_Class1.a();

		int x = 10;
		// 메소드에게 value형 데이터를 넘겨주었습니다/
		// 절대로 넘겨준 데이터에 변화가 일어나지 않습니다.
		method1_Class1.incValue(x);
		System.out.println(x);

		int[] arr = { 100, 200 };
		// 메소드에게 reference형의 데이터를 넘겨주었습니다.
		// 넘겨준 데이터에 변화가 발생할 수 있습니다.
		// 이런 경우는 document를 읽어보거나 데이터를 확인해보아야 합니다.
		method1_Class1.incReference(arr);
		System.out.println(arr[0]);

		int aa = 10;
		method1_Class1 mc = new method1_Class1();
		System.out.println(mc.sum(aa));

		int b= 14;
		System.out.println(mc.fiboNoRecursion(b));
		System.out.println(mc.fiboRecursion(b));
	}

}
