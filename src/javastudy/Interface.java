package javastudy;

interface PlayingCard { // 인터페이스는 오직 추상메서드와 상수만을 멤버로 가질 수 있다
	public static final int SPADE = 4; // 모든 멤버변수는 public static final 이어야하며 생략 가능
	final int DIAMOND = 3;
	static int HEART = 2;
	int CLOVER = 1;
	
	public abstract String getCardNumber(); // 모든 메서드는 public abstract 이며 생략 가능
}

interface Movable { // 인터페이스는 able로 많이 씀 어떤 메서드를 제공하는 의미를 강조하기 위해
	void move(int x, int y); // public abstract 생략된 것
}

interface Attackable {
	void attack(Unit2 u);
}

interface Fightable extends Movable, Attackable { // 인터페이스로부터만 상속받을 수 있으며 다중상속이 가능하다
	
}

abstract class Fighter implements Fightable {
	public void move(int x, int y) {} // 인터페이스의 메서드 중 일부만 구현한다면 abstract를 붙여서 추상클래스로 선언해야함
}

public class Interface {
	public static void main(String args[]) {
		Fight f = new Fight();
		
		if (f instanceof Unit2) {
			System.out.println("f는 Unit2 클래스의 자손");
		}
		if (f instanceof Fightable) {
			System.out.println("f는 Fightable 인터페이스 구현");
		}
		if (f instanceof Movable) {
			System.out.println("f는 Movable 인터페이스 구현");
		}
		if (f instanceof Attackable) {
			System.out.println("f는 Attackable 인터페이스 구현");
		}
		if (f instanceof Object) {
			System.out.println("f는 Object 클래스의 자손");
		}
	}
}

class Fight extends Unit2 implements Fightable { // 인터페이스는 인스턴스 생성 불가능 키워드 implements사용 동시에 상속도 가능
	public void move(int x, int y) {} // 오버라이딩 조상 메서드보다 넓은 범위의 접근 제어자 사용해야함 반드시 public
	public void attack(Unit2 u) {}
	
	Fightable method() { // 리턴타입이 인터페이스라는 것은 메서드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는 것을 의미한다
		Fight f = new Fight();
		return f;
	}
}

class Unit2 {
	int currentHP;
	int x;
	int y;
}