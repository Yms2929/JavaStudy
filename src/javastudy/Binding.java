package javastudy;

import java.util.Vector;

public class Binding {
	public static void main(String[] args) {
//		Parent1 p = new Child1();
//		Child1 c = new Child1();
//		
//		System.out.println("p.x = " + p.x);
//		p.method();
//		
//		System.out.println("c.x = " + c.x);
//		c.method();
		
		Buyer b = new Buyer();
		Phone p = new Phone();
		Computer c = new Computer();
		Audio a = new Audio();
		
		b.buy(p);
		b.buy(c);
		b.buy(a);
		b.summary();
		
		System.out.println("���� ���� ���� " + b.money);
		System.out.println("���� ���ʽ������� " + b.bonusPoint);
		System.out.println();
		
		b.refund(c);
		b.summary();
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
	
	Product() {
		
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
//	Product[] item = new Product[10];
	int i = 0;
	Vector item = new Vector();
	
//	void buy(Phone p) {
//		money = money - p.price;
//		bonusPoint = bonusPoint + p.bonusPoint;
//	}
//	
//	void buy(Computer c) {
//		money = money - c.price;
//		bonusPoint = bonusPoint + c.bonusPoint;
//	}
//	
//	void buy(Audio a) { // ��ǰ�� ������ �þ ������ ���ο� buy�޼��带 �߰��ؾ���
//		money = money - a.price;
//		bonusPoint = bonusPoint + a.bonusPoint;
//	}
	
	void buy(Product p) { // �Ű����� ������ ���� ������ ó������
		if (money < p.price) {
			System.out.println("�ܾ��� �����մϴ�");
			return;
		}
		
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
//		item[i++] = p;
		item.add(p);
		System.out.println(p + " ���ԿϷ�");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
//		for (int i = 0; i < item.length; i++) {
//			if (item[i] == null) break;
//			sum += item[i].price;
//			itemList += item[i] + ", ";
//		}
		
		for (int i = 0; i < item.size(); i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i==0) ? "" + p : ", " + p;
		}
		
		System.out.println("������ �� �ݾ��� " + sum);
		System.out.println("������ ��ǰ����� " + itemList);
	}
	
	void refund(Product p) {
		if (item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + " ��ǰ�Ϸ�");
		} else {
			System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�");
		}
	}
}