import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streampractice {

	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("John");
		names.add("Raj");
		names.add("Reva");
		names.add("Anusha");
		names.add("Riya");
		int count=0;
		
		
		for(int i=0;i<names.size();i++) {
			if(names.get(i).startsWith("R"))
			count++;
		}
		System.out.println(count);
		
		long c = names.stream().filter(n->n.startsWith("R")).count();
		System.out.println(c);
		
	//	Stream.of("Jon","Raj","Anu","Riya").filter(n->n.startsWith("A")).forEach(n->System.out.println(n));
		
	//	names.stream().filter(l->l.endsWith("a")).map(l->l.toUpperCase()).forEach(l->System.out.println(l));
		names.stream().filter(s->s.startsWith("R")).map(s->s.toUpperCase()).sorted().forEach(s->System.out.println(s));
		
		//Concatenate two arrays
		 List<String> li1=Arrays.asList("Raj","Anu","Ram,","Reva","John","Reva");
		 String s= "Man Has Two Legs and arams";
		 String[] str = s.split(" ");
		 List<String> li2=Arrays.asList(str);
		 
		Stream<String> st = Stream.concat(li1.stream(),li2.stream());
		boolean flag = st.anyMatch(q->q.equalsIgnoreCase("Anu"));
		System.out.println(flag);
		
		List<Integer> values=Arrays.asList(2,5,1,2,5,3,6,2,8);
		List<Integer> v = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(v.get(3)); 
	}

}
