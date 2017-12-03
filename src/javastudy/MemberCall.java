package javastudy;

public class MemberCall {
	int iv = 10;
	static int cv = 20;
	
	int iv2 = cv;
//	static int cv2 = iv; // Ŭ���������� �ν��Ͻ� ������ ����� �� ����
	static int cv2 = new MemberCall().iv; // ��ü�� �����ϰ� ��밡��
	
	public static void main(String args[]) {
		staticMethod1();
		MemberCall mc = new MemberCall();
		mc.instanceMethod1();
		staticMethod2();
		mc.instanceMethod2();
	}
	
	static void staticMethod1() {
		System.out.println(cv);
//		System.out.println(iv); // Ŭ�����޼��忡���� �ν��Ͻ����� ���Ұ�
		MemberCall mc = new MemberCall();
		System.out.println(mc.iv); // ��ü ������ �� �ν��Ͻ����� ��������
		System.out.println("-----");
	}
	
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv);
		System.out.println("-----");
	}
	
	static void staticMethod2() {
		staticMethod1();
//		instanceMethod1(); // Ŭ�����޼��忡���� �ν��Ͻ��޼��带 ȣ���� �� ����
		MemberCall mc = new MemberCall();
		mc.instanceMethod1(); // �ν��Ͻ��� ������ �Ŀ� ȣ�� ����
	}
	
	void instanceMethod2() { // �ν��Ͻ��޼��忡���� �ν��Ͻ��޼���� Ŭ�����޼��� ��� �ν��Ͻ� �������� ȣ�� ����
		staticMethod2();
		instanceMethod1();
	}
}