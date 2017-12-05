//package javastudy;
//
//public class Inheritance {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		CaptionTv ctv = new CaptionTv(); // 자손 클래스의 인스턴스를 생성하면 조상과 자손 클래스의 멤버가 합쳐진 하나의 인스턴스로 생성
//		ctv.channel = 10; // 조상 클래스로부터 상속받은 멤버
//		ctv.channelUp();
//		System.out.println(ctv.channel);
//		
//		ctv.displayCaption("Hello World");
//		ctv.caption = true;
//		ctv.displayCaption("Hello World");
//	}
//
//}
//
//class TvShow {
//	boolean power;
//	int channel;
//	
//	void power() { power = !power; }
//	void channelUp() { ++channel; }
//	void channelDown() { --channel; }
//}
//
//class CaptionTv extends TvShow { // 자손 클래스는 조상 클래스의 모든 멤버를 물려 받는다
//	boolean caption;
//	void displayCaption(String text) {
//		if (caption) {
//			System.out.println(text);
//		}
//	}
//}
//
//class Circle {
//	Point p = new Point(); // 포함관계는 ~은 ~을 가지고 있다 일때 // 상속관계는 ~은 ~이다 일때
//	int radius;
//}
//
//class Point {
//	int x;
//	int y;
//}