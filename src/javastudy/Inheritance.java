//package javastudy;
//
//public class Inheritance {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		CaptionTv ctv = new CaptionTv(); // �ڼ� Ŭ������ �ν��Ͻ��� �����ϸ� ����� �ڼ� Ŭ������ ����� ������ �ϳ��� �ν��Ͻ��� ����
//		ctv.channel = 10; // ���� Ŭ�����κ��� ��ӹ��� ���
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
//class CaptionTv extends TvShow { // �ڼ� Ŭ������ ���� Ŭ������ ��� ����� ���� �޴´�
//	boolean caption;
//	void displayCaption(String text) {
//		if (caption) {
//			System.out.println(text);
//		}
//	}
//}
//
//class Circle {
//	Point p = new Point(); // ���԰���� ~�� ~�� ������ �ִ� �϶� // ��Ӱ���� ~�� ~�̴� �϶�
//	int radius;
//}
//
//class Point {
//	int x;
//	int y;
//}