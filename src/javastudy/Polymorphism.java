package javastudy;

public class Polymorphism { // ������ ��Ӱ� ����
	public static void main(String args[]) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; // �ڼ�Ÿ���� ����Ÿ�� ���������� �Ҵ��� �� ����ȯ ���� ����
//		car.water(); // CarŸ���� ���������� water�޼��带 ȣ���� �� ����
		
		fe2 = (FireEngine)car; // ����ȯ
		fe2.water();
		
		if (fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance");
		}
		
		if (fe instanceof Car) { // FireEngineŬ������ �ڼ� Ŭ�����̹Ƿ� ���� ������� �����ϰ� �ֱ� ������ true ��ȯ
			System.out.println("This is a Car instance"); // �˻��� Ÿ������ ����ȯ ����
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