package javastudy;

public class Polymorphism { // 다형성 상속과 관련
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; // 자손타입을 조상타입 참조변수에 할당할 때 형변환 생략 가능
//		car.water(); // Car타입의 참조변수로 water메서드를 호출할 수 없음
		
		fe2 = (FireEngine)car; // 형변환
		fe2.water();
		
		if (fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		
		if (fe instanceof Car) { // FireEngine클래스는 자손 클래스이므로 조상 멤버들을 포함하고 있기 때문에 true 반환
			System.out.println("This is a Car instance"); // 검사한 타입으로 형변환 가능
		}
		
		if (fe instanceof Object) {
			System.out.println("This is an Object instance");
		}
		
		System.out.println(fe.getClass().getName());
	}
}

class Car {
	String color;
	int door;
	
	void drive( ) {
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {
		System.out.println("stop!!!");
	}
}

class FireEngine extends Car {
	void water() {
		System.out.println("water!!!");
	}
}

class Ambulance extends Car {
	void siren() {
		System.out.println("siren~~~");
	}
}