package javastudy;

public class AbstractClass {
	
	public static void main(String[] args) {
		Unit[] group = new Unit[3];
		group[0] = new Marine();
		group[1] = new Tank();
		group[2] = new Dropship();
		
		for (int i = 0; i < group.length; i++) {
			group[i].move(100, 200);
		}
	}
	
}

abstract class Player { // 추상클래스는 미완성클래스이며 추상메서드를 포함하고 있고 상속을 통해 구현해주어야 한다
	boolean pause;
	int currentPos;
	
	Player() {
		pause = false;
		currentPos = 0;
	}
	
	abstract void play(int pos); // 구현부가 없으며 주석으로 어떤 기능을 하는 메서드인지 적어준다
	abstract void stop();
	
	void play() {
		play(currentPos);
	}
	
	void pause() {
		if(pause) {
			pause = false;
			play(currentPos);
		} else {
			pause = true;
			stop();
		}
	}
}

class AudioPlayer extends Player { // 추상클래스로부터 상속받는 자손클래스
	void play(int pos) { // 오버라이딩해서 추상메서드를 모두 구현 해야한다
		
	}
	
	void stop() {
		
	}
}

abstract class Unit { // 공통된 부분을 뽑아내어 추상클래스로 만들고 상속받도록 함
	int x, y;
	abstract void move(int x, int y); // 상속 받은 클래스에 알맞게 반드시 구혀해야함
	void stop() {}
}

class Marine extends Unit {
	int x, y;
	
	void move(int x, int y) {
		System.out.println("Marine " + x + ", " + y + "로 이동");
	}
//	void stop() {}
	void stimPack() {}
}

class Tank extends Unit {
	int x, y;
	
	void move(int x, int y) {
		System.out.println("Tank " + x + ", " + y + "로 이동");
	}
//	void stop() {}
	void changeMode() {}
}

class Dropship extends Unit {
	int x, y;
	
	void move(int x, int y) {
		System.out.println("Dropship " + x + ", " + y + "로 이동");
	}
//	void stop() {}
	void load() {}
	void unload() {}
}