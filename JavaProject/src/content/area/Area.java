package content.area;

public class Area {
		//ÿ�����������Լ���һ�� ���÷�Χ  ���  ������
		private String name ; // �����name��ʾ ��������ԣ�����������������
		private static int age ; //�����age��ʾ �����ԣ�����������������		
		public Area(String name, int age){
			this.name = name;    //this.name ��ʾ�ö���ı���  ; ��һ��name��ʾ����Ĳ���
			this.age = age;
		}
		
		public Area(String name1){
			name = name1;  //������캯���������    this.name = name; �ǵ�Ч��    
			//��ע��this�ؼ��֣���ʵֻΪ������������ȡ���鷳...
		}
		
		static {  //��̬����飬���Գ�ʼ�� �������ֵ,ֻ����һ�Σ����ܳ�ʼ�� ���������ֵ
			age = 5;
			// name = "����";  // ���ܳ�ʼ���������ֵ
		}
		
		
		public static void main(String[] args) {
			int j = 3;//���j�������������� main����...
			for(int i =1 ; i < 10 ;i ++){ //i��������ֻ��forѭ����..
				System.out.println("���i�������򣬾�ֻ��forѭ����ʹ��...����ѭ���壬����ʧЧ��");
			}
			int i = 5; //˵�� ����forѭ���е�i�����Ѿ�������
			System.out.println("j�ı���ֵ������main�����У�������ʱʹ�ã�ֵΪ��"+j);
			
			{
				int k = 10; // k�������򣬾�ֻ���������̬������С����ˣ���������
				
				System.out.println("�������У�kֵ�������,ֵ��:"+k);
			}
			
			int k = 100; //˵��������е�k�����Ѿ�����
			
			test();//�༶ �ķ������Ե��� 
			//method(); //���󼶵ķ��� ���ܵ���
			
			System.out.println(age);  //
			//System.out.println(name);  //��̬���������ܵ��ö������ ��
		}
		
		/**
		 * ��������   �� �������
		 */
		public void method(){     //���󼶵ķ���
			//���������ر�Ҫע�⣺
			String name = "���������ڷ����еı�������������������������ô,��������ʾ�÷����еı���,��������ᱻ����..";
			//���Ҫʹ�ö����������ô������this�ؼ���
			String objName = this.name;
			
			System.out.println("�����ǣ�"+age);  //��Ϊ���������У�û��age����ʱ����ö������.
		}
		
		
		public static void test(){  //�༶�ķ���
			// String name = name; 
			int ages = age;
		}
		
		
		
}
