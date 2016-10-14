package content.area;

public class Area {
		//每个变量都有自己的一个 作用范围  或称  作用域
		private String name ; // 这里的name表示 对象的属性，作用于整个对象中
		private static int age ; //这里的age表示 类属性，作用于整个对象中		
		public Area(String name, int age){
			this.name = name;    //this.name 表示用对象的变量  ; 后一个name表示传入的参数
			this.age = age;
		}
		
		public Area(String name1){
			name = name1;  //这个构造函数跟上面的    this.name = name; 是等效的    
			//【注】this关键字，其实只为避免名字重新取的麻烦...
		}
		
		static {  //静态代码块，可以初始化 类变量的值,只运行一次；不能初始化 对象变量的值
			age = 5;
			// name = "新手";  // 不能初始化对象变量值
		}
		
		
		public static void main(String[] args) {
			int j = 3;//这个j的作用域是整个 main函数...
			for(int i =1 ; i < 10 ;i ++){ //i的作用域只有for循环体..
				System.out.println("这个i的作用域，就只有for循环内使用...出了循环体，它就失效了");
			}
			int i = 5; //说明 上面for循环中的i变量已经销毁了
			System.out.println("j的变量值在整个main方法中，都能随时使用，值为："+j);
			
			{
				int k = 10; // k的作用域，就只是在这个静态代码块中。出了，就销毁了
				
				System.out.println("整个块中，k值都会存在,值是:"+k);
			}
			
			int k = 100; //说明上面块中的k变量已经销毁
			
			test();//类级 的方法可以调用 
			//method(); //对象级的方法 不能调用
			
			System.out.println(age);  //
			//System.out.println(name);  //静态方法，不能调用对象变量 。
		}
		
		/**
		 * 方法变量   和 对象变量
		 */
		public void method(){     //对象级的方法
			//以下内容特别要注意：
			String name = "这里是属于方法中的变量，如果跟对象变量重名，那么,它仅仅表示该方法中的变量,对象变量会被覆盖..";
			//如果要使用对象变量。那么，得用this关键字
			String objName = this.name;
			
			System.out.println("年龄是："+age);  //因为方法变量中，没有age，此时会调用对象变量.
		}
		
		
		public static void test(){  //类级的方法
			// String name = name; 
			int ages = age;
		}
		
		
		
}
