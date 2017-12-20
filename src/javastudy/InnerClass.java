package javastudy;

import java.awt.*;
import java.awt.event.*;

import com.sun.corba.se.spi.orbutil.fsm.Action;

public class InnerClass { // �ܺ� Ŭ����
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InnerClass2 { // ���� Ŭ�������� �ܺ� Ŭ������ ������� ���� ������ �� �ִ�. �ڵ��� ���⼺�� ���� �� �ִ�(ĸ��ȭ)
		int iv = 100;
		int iiv = outerIv; // �ܺ� Ŭ������ private����� ���ٰ���
		int ccv = outerCv; // static�� ���� ���ٰ���
	}
	static class StaticInner { // ����� ��ġ�� ���� Ŭ���� ������
		static int cv = 200; // staticŬ������ static��� ���� ����
//		int siv = outerIv; // staticŬ������ �ܺ�Ŭ������ �ν��Ͻ������ �����Ҽ� ����
	}
	
	void innerMethod() {
		int lv0 = 0;
		final int lv = 0;
		
		class LocalClass { // ���� Ŭ����
			int iv = 300;
			final static int cv = 300; // ����̹Ƿ� static ���
			int lv1 = lv0;
			int lv2 = lv;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(StaticInner.cv);
		
		InnerClass ic = new InnerClass();
		InnerClass2 ic2 = ic.new InnerClass2(); // ����Ŭ������ �ܺ�Ŭ������ ���� �����ؾ߸� ������ �� �ִ�
		System.out.println(ic2.iv);
		
		Button b = new Button("start");
		b.addActionListener(new EventHandler());
		b.addActionListener(new ActionListener() { // �͸� Ŭ������ �̸��� ���� Ŭ������ ����� ��ü�� ������ ���ÿ� �ϹǷ� �� �ѹ��� ����� �� �ְ� �ϳ��� ��ü�� ������ �� �ִ�
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!");
			}
		}); // �͸� Ŭ������ ��
	}

}

class EventHandler implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!");
	}
}