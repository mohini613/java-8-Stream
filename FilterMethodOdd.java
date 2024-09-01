package Stream;

import java.util.Arrays;
import java.util.List;

public class FilterMethodOdd {
public static void main(String[] args) {
	List<Integer>l=Arrays.asList(12,20,30,40,50,25,90,15,21);
	System.out.println(l);
	
	for(Integer l1: l) {
		if(l1%2!=0) {
			System.out.println(l1);
		}
	}
}
}
