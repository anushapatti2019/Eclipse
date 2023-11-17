package ExcelData;

import java.io.IOException;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) throws IOException {
		dataDriven d= new dataDriven();
		ArrayList<String> a = d.getdata("add items");
		System.out.println(a);
		System.out.println(a.get(2));

	}

}
