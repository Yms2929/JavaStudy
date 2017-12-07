package javastudy;

public class Modifier {
	static int width = 200; // 클래스 변수
	static int height = 120;
	
	static { // 클래스 초기화
		
	}
	
	static int max(int a, int b) { // 클래스 메서드
		return a > b ? a: b;
	}
	
	public static void main(String[] args) {
		System.out.println(width);
		System.out.println(max(width,height));
		
		FinalTest ft = new FinalTest();
		System.out.println(ft.MAX_SIZE);
		System.out.println(ft.getMaxSize());
		
		Card c = new Card();
		System.out.println(c.KIND);
		System.out.println(c);
	}
}

final class FinalTest { // 조상이 될 수 없는 클래스
	final int MAX_SIZE = 10; // 값을 변경할 수 없는 멤버변수
	
	final int getMaxSize() { // 오버라이딩할 수 없는 메서드
		final int LV = MAX_SIZE; // 값을 변경할 수 없는 지역변수
		return LV;
	}
}

class Card {
	final int NUMBER;
	final String KIND;
	
	Card() {
		this("HEART", 1);
	}
	
	Card(String kind, int num) { // 매겨변수로 넘겨받은 값으로 초기화
		KIND = kind;
		NUMBER = num;
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}

abstract class AbstractTest { // 추상 클래스 (추상 메서드를 포함한 클래스) 인스턴스 생성 불가
	abstract void move(); // 추상 메서드 (구현부가 없는 메서드)
}

class AccessModifier {
	private int hour; // 같은 클래스 내에서만 접근 가능
	protected int minute; // 같은 패키지 내에서, 다른 패키지의 자손클래스에서 접근 가능
	public int second; // 접근 제한이 없다
}