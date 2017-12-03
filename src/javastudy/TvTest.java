package javastudy;

public class TvTest {
	public static void main(String args[]) {
		Tv tv = new Tv();
		tv.channel = 7;
		tv.channelDown();
		System.out.println("���� ä���� " + tv.channel);
		
		Time[] time = new Time[3]; // ��ü �迭
		time[0] = new Time();
		time[1] = new Time();
		time[2] = new Time();
		
		System.out.println("���� �ð��� " + time[0].getHour());
	}
}

class Tv {
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

class Time {
	int hour; // �ν��Ͻ������� Ŭ���� ������ ����Ǹ� �ν��Ͻ��� �����ؾ� ��� ����
	static int minute; // Ŭ���������� Ŭ������ �޸𸮿� �ε��ɶ� �����Ǿ� ���α׷��� ����� �� ���� ���� public ���̸� ����������
	private float second;
	
	void year() {
		int year; // ���������� �޼��� ���� ����Ǹ� �޼��� �������� ��밡�� �޼��尡 ����Ǹ� �Ҹ��
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public float getSecond() {
		return second;
	}
	
	public void setHour(int h) {
		if (h < 0 || h > 23) return;
		hour = h;
	}
	
	public void setMinute(int m) {
		if (m < 0 || m > 59) return;
		minute = m;
	}
	
	public void setSecond(float s) {
		if (s < 0.0f || s > 59.99f) return;
		second = s;
	}
}