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
		
		System.out.println("현재 남은 돈은 " + b.money);
		System.out.println("현재 보너스점수는 " + b.bonusPoint);
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
	int price; // 제품 가격
	int bonusPoint; // 보너스점수
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); // 보너스점수는 제품가격의 10%
	}
	
	Product() {
		
	}
}

class Phone extends Product {
	Phone() {
		super(100); // 조상클래스의 생성자 호출
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
//	void buy(Audio a) { // 제품의 종류가 늘어날 때마다 새로운 buy메서드를 추가해야함
//		money = money - a.price;
//		bonusPoint = bonusPoint + a.bonusPoint;
//	}
	
	void buy(Product p) { // 매개변수 다형성 적용 간단히 처리가능
		if (money < p.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
//		item[i++] = p;
		item.add(p);
		System.out.println(p + " 구입완료");
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
		
		System.out.println("구입한 총 금액은 " + sum);
		System.out.println("구입한 제품목록은 " + itemList);
	}
	
	void refund(Product p) {
		if (item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + " 반품완료");
		} else {
			System.out.println("구입하신 제품 중 해당 제품은 없습니다");
		}
	}
}