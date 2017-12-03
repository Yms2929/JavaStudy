package javastudy;

public class Overloading {

	public static void main(String[] args) {
		Add add = new Add();
		System.out.println(add.add(3, 3));
		System.out.println(add.add(3L, 3));
		System.out.println(add.add(3, 3L));
		System.out.println(add.add(3L, 3L));
		System.out.println(add.add(3,5,10));
	}

}

class Add {
	int a, b;
	
	Add() { // 생성자는 클래스와 이름이 같고 리턴 값이 없다
		// 생성자는 인스턴스가 생성될 때 호출되는 인스턴스 초기화 메서드
	}
	
	Add(int a, int b) { // 매개변수 있는 생성자
		this.a = a;
		this.b = b;
	}
	
	Add(Add add) {
		a = add.a;
		b = add.b;
	}
	
	int add(int a, int b) { // 오버로딩은 메서드 이름이 같으며 매개변수의 개수 또는 타입이 달라야 한다
		return a + b;
	}
	
	long add(int a, long b) {
		return a + b;
	}
	
	long add(long a, int b) {
		return a + b;
	}
	
	long add(long a, long b) {
		return a + b;
	}
	
	int add(int...a) { // 가변인자
		int result = 0;
		for (int b : a) {
			result = result + b;
		}
		return result;
	}
}