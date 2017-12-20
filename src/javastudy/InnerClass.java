package javastudy;

import java.awt.*;
import java.awt.event.*;

import com.sun.corba.se.spi.orbutil.fsm.Action;

public class InnerClass { // 외부 클래스
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InnerClass2 { // 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있다. 코드의 복잡성을 줄일 수 있다(캡슐화)
		int iv = 100;
		int iiv = outerIv; // 외부 클래스의 private멤버도 접근가능
		int ccv = outerCv; // static도 물론 접근가능
	}
	static class StaticInner { // 선언된 위치에 따라 클래스 나뉜다
		static int cv = 200; // static클래스만 static멤버 정의 가능
//		int siv = outerIv; // static클래스는 외부클래스의 인스턴스멤버에 접근할수 없음
	}
	
	void innerMethod() {
		int lv0 = 0;
		final int lv = 0;
		
		class LocalClass { // 지역 클래스
			int iv = 300;
			final static int cv = 300; // 상수이므로 static 허용
			int lv1 = lv0;
			int lv2 = lv;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(StaticInner.cv);
		
		InnerClass ic = new InnerClass();
		InnerClass2 ic2 = ic.new InnerClass2(); // 내부클래스는 외부클래스를 먼저 생성해야만 생성할 수 있다
		System.out.println(ic2.iv);
		
		Button b = new Button("start");
		b.addActionListener(new EventHandler());
		b.addActionListener(new ActionListener() { // 익명 클래스는 이름이 없고 클래스의 선언과 객체의 생성을 동시에 하므로 단 한번만 사용할 수 있고 하나의 객체만 생성할 수 있다
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!");
			}
		}); // 익명 클래스의 끝
	}

}

class EventHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!");
	}
}