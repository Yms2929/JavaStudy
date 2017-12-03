package javastudy;

public class Initialization {
	static int cv = 1; // 1. Ŭ�������� ����� �ʱ�ȭ
	int iv = 1; // 3. �ν��Ͻ����� ����� �ʱ�ȭ
	String name;
	
	static { // 2. Ŭ���� ���� �ʱ�ȭ
		cv = 2;
	}
	
	{ iv = 2; } // 4. �ν��Ͻ� ���� �ʱ�ȭ
	
	Initialization() { // 5. ������
		this("����" + ++cv);
	}
	
	Initialization(String name) {
		this.name = name;
		System.out.println("�̸���? " + this.name);
	}
	
	public static void main(String[] args) {
		Initialization initialization1 = new Initialization(); // �ν��Ͻ��� ������ �� ���� �ʱ�ȭ��
		Initialization initialization2 = new Initialization("�����");
		Initialization initialization3 = new Initialization();
	}

}