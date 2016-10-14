package task.E20160726.e4;

/**
 * ×Ö·û´®Á¬½Ó
 */
public class EStringLk {
	public String add(String [] str){
		String tmp = null;
		
		for (int i=0; i<str.length; i++){
			if (i == 0){
				tmp = str[i] + ",";
			} else if (i < str.length-1) {
				tmp += str[i] + ",";
			} else {
				tmp += str[i];
			}
		}
		
		return tmp;
	}
}
