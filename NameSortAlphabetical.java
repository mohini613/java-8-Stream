package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameSortAlphabetical {

	public static void main(String[] args) {
		List <String>l=Arrays.asList("Jay","Pravin","Vaibhav","Ganesh","Pravin");
	System.out.println("original"+l);
    List<String> sortedList = l.stream().sorted().collect(Collectors.toList());
	System.out.println("sorted"+sortedList);
	
	List<String>reverseSortedList =l.stream()
			.sorted((p,q)->q.compareTo(p))
                     .collect(Collectors.toList());
	System.out.println("reverse"+reverseSortedList);
	
	 List<String>  UpperCase= l.stream().
			 map(String::toUpperCase).
			 sorted().collect(Collectors.toList());
		System.out.println("uppercase"+UpperCase);
	
	}

}
