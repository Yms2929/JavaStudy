package javastudy;

public class TvTest {
	public static void main(String args[]) {
		Tv tv = new Tv();
		tv.channel = 7;
		tv.channelDown();
		System.out.println("현재 채널은 " + tv.channel);
		
		Time[] time = new Time[3]; // 객체 배열
		time[0] = new Time();
		time[1] = new Time();
		time[2] = new Time();
		
		System.out.println("현재 시간은 " + time[0].getHour());
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
	int hour; // 인스턴스변수는 클래스 영역에 선언되며 인스턴스를 생성해야 사용 가능
	static int minute; // 클래스변수는 클래스가 메모리에 로딩될때 생성되어 프로그램이 종료될 때 까지 유지 public 붙이면 전역변수됨
	private float second;
	
	void year() {
		int year; // 지역변수는 메서드 내에 선언되며 메서드 내에서만 사용가능 메서드가 종료되면 소멸됨
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