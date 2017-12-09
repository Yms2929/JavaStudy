package javastudy;

public class Binding {
	public static void main(String[] args) {
		Parent1 p = new Child1();
		Child1 c = new Child1();
		
		System.out.println("p.x = " + p.x);
		p.method();
		
		System.out.println("c.x = " + c.x);
		c.method();
		
		Buyer b = new Buyer();
		b.buy(new Phone());
		b.buy(new Computer());
		b.buy(new Audio());
		
		System.out.println("���� ���� ���� " + b.money);
		System.out.println("���� ���ʽ������� " + b.bonusPoint);
		
		Product pd[] = new Product[3];
		pd[0] = new Phone();
		pd[1] = new Computer();
		pd[2] = new Audio();
	}
}

class Parent1 {
	int x = 100;
	
	void method() {
		System.out.println("Parent method");
	}
}

class Child1 extends Parent1 {
	int x = 200;
	
	void method() {
		System.out.println("Child method");
	}
}

class Product {
	int price; // ��ǰ ����
	int bonusPoint; // ���ʽ�����
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); // ���ʽ������� ��ǰ������ 10%
	}
}

class Phone extends Product {
	Phone() {
		super(100); // ����Ŭ������ ������ ȣ��
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(70);
	}
	
	public String toString() {
		return "Audio";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Phone p) {
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
	}
	
	void buy(Computer c) {
		money = money - c.price;
		bonusPoint = bonusPoint + c.bonusPoint;
	}
	
	void buy(Audio a) { // ��ǰ�� ������ �þ ������ ���ο� buy�޼��带 �߰��ؾ���
		money = money - a.price;
		bonusPoint = bonusPoint + a.bonusPoint;
	}
	
	void buy(Product p) { // �Ű����� ������ ���� ������ ó������
		if (money < p.price) {
			System.out.println("�ܾ��� �����մϴ�");
			return;
		}
		
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		System.out.println(p + "���ԿϷ�");
	}
}