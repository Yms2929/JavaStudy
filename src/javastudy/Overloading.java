package javastudy;

public class Overloading {

	public static void main(String[] args) {
		Add add = new Add();
		System.out.println(add.add(3, 3));
		System.out.println(add.add(3L, 3));
		System.out.println(add.add(3, 3L));
		System.out.println(add.add(3L, 3L));
		System.out.println(add.add(3,5,10));
	}

}

class Add {
	int a, b;
	
	Add() { // �����ڴ� Ŭ������ �̸��� ���� ���� ���� ����
		// �����ڴ� �ν��Ͻ��� ������ �� ȣ��Ǵ� �ν��Ͻ� �ʱ�ȭ �޼���
	}
	
	Add(int a, int b) { // �Ű����� �ִ� ������
		this.a = a;
		this.b = b;
	}
	
	Add(Add add) {
		a = add.a;
		b = add.b;
	}
	
	int add(int a, int b) { // �����ε��� �޼��� �̸��� ������ �Ű������� ���� �Ǵ� Ÿ���� �޶�� �Ѵ�
		return a + b;
	}
	
	long add(int a, long b) {
		return a + b;
	}
	
	long add(long a, int b) {
		return a + b;
	}
	
	long add(long a, long b) {
		return a + b;
	}
	
	int add(int...a) { // ��������
		int result = 0;
		for (int b : a) {
			result = result + b;
		}
		return result;
	}
}