package content.single;

/**
 * µ¥ÀýÄ£Ê½
 */
public class Single {
	
	private static  Single single = new Single();
	
	private Single(){}
	
	public static Single getInstance(){
		return single;
	}
}
