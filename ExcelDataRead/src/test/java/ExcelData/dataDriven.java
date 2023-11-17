package ExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	public ArrayList<String> getdata(String testcasename) throws IOException {
		
		ArrayList<String> a= new ArrayList<String>();
		FileInputStream fs = new FileInputStream("C:\\Users\\anusha.patti\\Desktop\\datademo.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fs);

		int sheets = workbook.getNumberOfSheets(); // getting no of sheets in excel
		int k = 0;
		for (int i = 0; i < sheets; i++) {

			if (workbook.getSheetAt(i).getSheetName().equalsIgnoreCase("testdata")) { // searching for sheet on excel
				XSSFSheet testsheet = workbook.getSheetAt(i);
				Iterator<Row> row = testsheet.rowIterator(); // Getting all rows of sheet

				Row rowvalue = row.next(); // getting first row
				Iterator<Cell> ce = rowvalue.cellIterator(); // getting all cell values of first row
				int count = 0;

				while (ce.hasNext()) {
					Cell cellvalue = ce.next();
					if (cellvalue.getStringCellValue().equalsIgnoreCase("testcases")) { // searching for cell data of
																						// first row
						System.out.println(cellvalue.getStringCellValue());
						k = count;
					}
					count++;
				}
				while (row.hasNext()) {
					Row r = row.next();
					if (r.getCell(k).getStringCellValue().equalsIgnoreCase(testcasename)) {
						Iterator<Cell> cell = r.cellIterator();
						while (cell.hasNext()) {
							a.add(cell.next().getStringCellValue());
						}
					}
				}
			}
		}
		return a;

	}

	
}
