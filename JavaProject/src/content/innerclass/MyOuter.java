package content.innerclass;

public class MyOuter {
	private int x = 100;
	/*
	 * ��Ա�ڲ��ࣺû����static�����Ҷ��������ⲿ�������е��ࡣ ����Ϊ�ⲿ���һ����Ա���ڣ����ⲿ������ԡ��������С�
	 * 1.��Ա�ڲ����еķ�������ֱ��ʹ���ⲿ���ʵ��������ʵ�������� 2.�ڳ�Ա�ڲ����п���ֱ�����ڲ��ഴ������ 3.��Ա�ڲ����в��ܶ��徲̬����
	 */
	private static int i = 1;
	private int j = 10;
	private int k = 20;
	
	// ��Ա�ڲ���
	class Inner {
		// static int inner_i =100; //�ڲ����в������徲̬����
		int j = 100;// �ڲ������ⲿ���ʵ���������Թ���
		int inner_i = 1;

		void inner_f1() {
			System.out.println(i);// �ⲿ��ı���������ڲ���ı���û��ͬ���ģ������ֱ���ñ����������ⲿ��ı���
			System.out.println(j);// ���ڲ����з����ڲ����Լ��ı���ֱ���ñ�����
			System.out.println(this.j);// Ҳ�������ڲ�������"this.������"�������ڲ������
			// �����ⲿ�������ڲ���ͬ����ʵ����������"�ⲿ����.this.������"��
			System.out.println(k);// �ⲿ��ı���������ڲ���ı���û��ͬ���ģ������ֱ���ñ����������ⲿ��ı���
			outer_f1();
			outer_f2();
		}
	}

	public static void outer_f1() {
		// do more something
	}

	public void outer_f2() {
		// do more something
	}

	// �ⲿ��ķǾ�̬�������ʳ�Ա�ڲ���
	public void outer_f3() {
		Inner inner = new Inner();
		inner.inner_f1();
	}

	// �ⲿ��ľ�̬�������ʳ�Ա�ڲ��࣬�����ⲿ���ⲿ���ʳ�Ա�ڲ���һ��
	public static void outer_f4() {
		// step1 �����ⲿ�����
		MyOuter out = new MyOuter();
		// ***step2 �����ⲿ��������ڲ������***
		Inner inner = out.new Inner();
		// step3 �����ڲ���ķ���
		inner.inner_f1();
	}

	public static void main(String[] args) {
		outer_f4();
	}
}
