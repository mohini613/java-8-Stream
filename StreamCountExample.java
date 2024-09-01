package Stream;
import java.util.List;
import java.util.Arrays;

public class StreamCountExample {

	public static void main(String[] args) {
		        List<Integer> l = Arrays.asList(10, 20, 30, 40);
		        long count = l.stream().count();
		        //System.out.println(l);
		        System.out.println(count);
		    }
	}


