package javastudy;

public class RepairableTest {
	public static void main(String args[]) {
		Tanks tank = new Tanks();
		Dropships dropship = new Dropships();
		Marines marine = new Marines();
		SCV scv = new SCV();
		
		scv.repair(tank);
		scv.repair(dropship);
	}
}

interface Repairable {}

class Units {
	int hitPoint;
	final int MAX_HP;
	
	Units(int hp) {
		MAX_HP = hp;
	}
}

class GroundUnit extends Units {
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Units {
	AirUnit(int hp) {
		super(hp);
	}
}

class Tanks extends GroundUnit implements Repairable {
	Tanks() {
		super(150);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}
}

class Dropships extends AirUnit implements Repairable { // 상속관계에서 공통점은 없지만 인터페이스를 이용하면 공통점을 부여할 수 있다
	Dropships() {
		super(125);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Dropship";
	}
}

class Marines extends GroundUnit {
	Marines() {
		super(40);
		hitPoint = MAX_HP;
	}
}

class SCV extends GroundUnit implements Repairable {
	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) { // Repairable 인터페이스를 구현한 클래스의 인스턴스만 매개변수로 들어온다
		if (r instanceof Units) {
			Units u = (Units)r;
			
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString() + "의 수리가 끝났습니다");
		}
	}
}