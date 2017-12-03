package javastudy;

public class Initialization {
	static int cv = 1; // 1. 클래스변수 명시적 초기화
	int iv = 1; // 3. 인스턴스변수 명시적 초기화
	String name;
	
	static { // 2. 클래스 변수 초기화
		cv = 2;
	}
	
	{ iv = 2; } // 4. 인스턴스 변수 초기화
	
	Initialization() { // 5. 생성자
		this("문수" + ++cv);
	}
	
	Initialization(String name) {
		this.name = name;
		System.out.println("이름은? " + this.name);
	}
	
	public static void main(String[] args) {
		Initialization initialization1 = new Initialization(); // 인스턴스를 생성할 때 변수 초기화됨
		Initialization initialization2 = new Initialization("배고파");
		Initialization initialization3 = new Initialization();
	}

}