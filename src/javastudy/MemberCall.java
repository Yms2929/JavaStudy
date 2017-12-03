package javastudy;

public class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv; // 클래스변수는 인스턴스 변수를 사용할 수 없음
	static int cv2 = new MemberCall().iv; // 객체를 생성하고 사용가능
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv); // 클래스메서드에서는 인스턴스변수 사용불가
		MemberCall mc = new MemberCall();
		System.out.println(mc.iv); // 객체 생성한 후 인스턴스변수 참조가능
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1(); // 클래스메서드에서는 인스턴스메서드를 호출할 수 없음
		MemberCall mc = new MemberCall();
		mc.instanceMethod1(); // 인스턴스를 생성한 후에 호출 가능
	}
	
	void instanceMethod2() { // 인스턴스메서드에서는 인스턴스메서드와 클래스메서드 모두 인스턴스 생성없이 호출 가능
		staticMethod2();
		instanceMethod1();
	}
}