package javastudy;

public class Modifier {
	static int width = 200; // Ŭ���� ����
	static int height = 120;
	
	static { // Ŭ���� �ʱ�ȭ
		
	}
	
	static int max(int a, int b) { // Ŭ���� �޼���
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

final class FinalTest { // ������ �� �� ���� Ŭ����
	final int MAX_SIZE = 10; // ���� ������ �� ���� �������
	
	final int getMaxSize() { // �������̵��� �� ���� �޼���
		final int LV = MAX_SIZE; // ���� ������ �� ���� ��������
		return LV;
	}
}

class Card {
	final int NUMBER;
	final String KIND;
	
	Card() {
		this("HEART", 1);
	}
	
	Card(String kind, int num) { // �Űܺ����� �Ѱܹ��� ������ �ʱ�ȭ
		KIND = kind;
		NUMBER = num;
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}

abstract class AbstractTest { // �߻� Ŭ���� (�߻� �޼��带 ������ Ŭ����) �ν��Ͻ� ���� �Ұ�
	abstract void move(); // �߻� �޼��� (�����ΰ� ���� �޼���)
}

class AccessModifier {
	private int hour; // ���� Ŭ���� �������� ���� ����
	protected int minute; // ���� ��Ű�� ������, �ٸ� ��Ű���� �ڼ�Ŭ�������� ���� ����
	public int second; // ���� ������ ����
}