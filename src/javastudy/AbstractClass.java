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

abstract class Player { // �߻�Ŭ������ �̿ϼ�Ŭ�����̸� �߻�޼��带 �����ϰ� �ְ� ����� ���� �������־�� �Ѵ�
	boolean pause;
	int currentPos;
	
	Player() {
		pause = false;
		currentPos = 0;
	}
	
	abstract void play(int pos); // �����ΰ� ������ �ּ����� � ����� �ϴ� �޼������� �����ش�
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

class AudioPlayer extends Player { // �߻�Ŭ�����κ��� ��ӹ޴� �ڼ�Ŭ����
	void play(int pos) { // �������̵��ؼ� �߻�޼��带 ��� ���� �ؾ��Ѵ�
		
	}
	
	void stop() {
		
	}
}

abstract class Unit { // ����� �κ��� �̾Ƴ��� �߻�Ŭ������ ����� ��ӹ޵��� ��
	int x, y;
	abstract void move(int x, int y); // ��� ���� Ŭ������ �˸°� �ݵ�� �����ؾ���
	void stop() {}
}

class Marine extends Unit {
	int x, y;
	
	void move(int x, int y) {
		System.out.println("Marine " + x + ", " + y + "�� �̵�");
	}
//	void stop() {}
	void stimPack() {}
}

class Tank extends Unit {
	int x, y;
	
	void move(int x, int y) {
		System.out.println("Tank " + x + ", " + y + "�� �̵�");
	}
//	void stop() {}
	void changeMode() {}
}

class Dropship extends Unit {
	int x, y;
	
	void move(int x, int y) {
		System.out.println("Dropship " + x + ", " + y + "�� �̵�");
	}
//	void stop() {}
	void load() {}
	void unload() {}
}