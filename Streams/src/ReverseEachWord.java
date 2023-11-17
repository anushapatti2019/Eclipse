import java.util.Arrays;
import java.util.List;


public class ReverseEachWord {

	public static void main(String[] args) {
	
		String str="geeks quiz practice code";
		String str2="";
		
		List<String> li = Arrays.asList(str.split(" "));
		
		for( int i=li.size()-1;i>=0;i--) {
			str2+=li.get(i);
			str2+=" ";
			
		}
		System.out.println(str2);
			
	
}
}
