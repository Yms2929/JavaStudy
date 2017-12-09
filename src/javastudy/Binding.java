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
		
		System.out.println("현재 남은 돈은 " + b.money);
		System.out.println("현재 보너스점수는 " + b.bonusPoint);
		
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
	int price; // 제품 가격
	int bonusPoint; // 보너스점수
	
	Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0); // 보너스점수는 제품가격의 10%
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
	
	void buy(Phone p) {
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
	}
	
	void buy(Computer c) {
		money = money - c.price;
		bonusPoint = bonusPoint + c.bonusPoint;
	}
	
	void buy(Audio a) { // 제품의 종류가 늘어날 때마다 새로운 buy메서드를 추가해야함
		money = money - a.price;
		bonusPoint = bonusPoint + a.bonusPoint;
	}
	
	void buy(Product p) { // 매개변수 다형성 적용 간단히 처리가능
		if (money < p.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		System.out.println(p + "구입완료");
	}
}