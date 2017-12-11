package javastudy;

interface PlayingCard { // �������̽��� ���� �߻�޼���� ������� ����� ���� �� �ִ�
	public static final int SPADE = 4; // ��� ��������� public static final �̾���ϸ� ���� ����
	final int DIAMOND = 3;
	static int HEART = 2;
	int CLOVER = 1;
	
	public abstract String getCardNumber(); // ��� �޼���� public abstract �̸� ���� ����
}

interface Movable { // �������̽��� able�� ���� �� � �޼��带 �����ϴ� �ǹ̸� �����ϱ� ����
	void move(int x, int y); // public abstract ������ ��
}

interface Attackable {
	void attack(Unit2 u);
}

interface Fightable extends Movable, Attackable { // �������̽��κ��͸� ��ӹ��� �� ������ ���߻���� �����ϴ�
	
}

abstract class Fighter implements Fightable {
	public void move(int x, int y) {} // �������̽��� �޼��� �� �Ϻθ� �����Ѵٸ� abstract�� �ٿ��� �߻�Ŭ������ �����ؾ���
}

public class Interface {
	public static void main(String args[]) {
		Fight f = new Fight();
		
		if (f instanceof Unit2) {
			System.out.println("f�� Unit2 Ŭ������ �ڼ�");
		}
		if (f instanceof Fightable) {
			System.out.println("f�� Fightable �������̽� ����");
		}
		if (f instanceof Movable) {
			System.out.println("f�� Movable �������̽� ����");
		}
		if (f instanceof Attackable) {
			System.out.println("f�� Attackable �������̽� ����");
		}
		if (f instanceof Object) {
			System.out.println("f�� Object Ŭ������ �ڼ�");
		}
	}
}

class Fight extends Unit2 implements Fightable { // �������̽��� �ν��Ͻ� ���� �Ұ��� Ű���� implements��� ���ÿ� ��ӵ� ����
	public void move(int x, int y) {} // �������̵� ���� �޼��庸�� ���� ������ ���� ������ ����ؾ��� �ݵ�� public
	public void attack(Unit2 u) {}
	
	Fightable method() { // ����Ÿ���� �������̽���� ���� �޼��尡 �ش� �������̽��� ������ Ŭ������ �ν��Ͻ��� ��ȯ�Ѵٴ� ���� �ǹ��Ѵ�
		Fight f = new Fight();
		return f;
	}
}

class Unit2 {
	int currentHP;
	int x;
	int y;
}