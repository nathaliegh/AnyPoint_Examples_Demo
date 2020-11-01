package javacall;

import java.util.Arrays;
import java.util.List;

public class StringUtility {
	
	public static List<String> splitString(String data){
		String[] dataList = data.split(",");
	    return	Arrays.asList(dataList);
	}
	
	
	public static void main (String[] args) {
		System.out.println(splitString("Nathalie,Jean,David"));
	}

}
