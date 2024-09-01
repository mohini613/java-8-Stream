package Stream;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
public class alphabeticalSortedMeth {

	public static void main(String[] args) {
		List <String>l=Arrays.asList("Jay","Pravin","Vaibhav","Ganesh","Pravin");
		System.out.println(l);
		
		l.stream().
		  sorted().
		    collect((Collectors.toList()));
		System.out.println(l);	
		}

}
