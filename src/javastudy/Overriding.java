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

class Location3D extends Location { // �������̵��� ���� Ŭ�����κ��� ��ӹ��� �޼����� ������ �����ϴ� ��
	int z;
	
	String getLocation() { // �θ�Ŭ������ �ڽ�Ŭ������ �޼��� �̸�, �Ű�����, ��ȯŸ���� ���ƾ� �Ѵ�
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
		System.out.println("this.x=" + this.x); // �ڽ� Ŭ������ ��� �ڱ� �ڽ��϶� this
		System.out.println("super.x=" + super.x); // ���� Ŭ������ ����� ������ �� super�� ����
	}
}

class ImportTest {
	
	ImportTest() {
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("���� ��¥�� " + date.format(today));
		System.out.println("���� �ð��� " + time.format(today));
	}
}