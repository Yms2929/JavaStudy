package javastudy;
import java.util.*;
import java.text.*;

public class Overriding {
	public static void main(String args[]) {
		Child c = new Child();
		c.method();
		
		ImportTest it = new ImportTest();
	}
}

class Location {
	int x;
	int y;
	
	String getLocation() {
		return "x :" + x + ", y :" + y;
	}
}

class Location3D extends Location { // 오버라이딩은 조상 클래스로부터 상속받은 메서드의 내용을 변경하는 것
	int z;
	
	String getLocation() { // 부모클래스와 자식클래스의 메서드 이름, 매개변수, 반환타입이 같아야 한다
		return "x :" + x + ", y:" + y + ", z :" + z;
	}
}

class Parent {
	int x = 10;
}

class Child extends Parent {
	int x = 20;
	
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x); // 자식 클래스의 멤버 자기 자신일때 this
		System.out.println("super.x=" + super.x); // 조상 클래스의 멤버를 구분할 때 super를 쓴다
	}
}

class ImportTest {
	
	ImportTest() {
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("오늘 날짜는 " + date.format(today));
		System.out.println("현재 시간은 " + time.format(today));
	}
}