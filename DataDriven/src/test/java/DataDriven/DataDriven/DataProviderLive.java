package DataDriven.DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderLive {
	DataFormatter formatter = new DataFormatter();

	@Test(dataProvider = "drivedata")
	public void testdata(String u, String p, String e) {
		System.out.println(u + p + e);
	}

	@DataProvider(name = "drivedata")
	public Object[][] getdata() throws IOException {
		FileInputStream fs = new FileInputStream("C:\\Users\\anusha.patti\\Desktop\\datademo.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);		//getting sheet
		int rowcount = sheet.getPhysicalNumberOfRows();	//counting no of rows in sheet
		Iterator<Row> row = sheet.rowIterator();
		Row rows = row.next();
		int cellcount = rows.getPhysicalNumberOfCells();//counting no of columns in sheet
		System.out.println(rowcount);
		System.out.println(cellcount);

		Object[][] data = new Object[rowcount - 1][cellcount];	//creating data object
		XSSFRow r;
		for (int i = 0; i < rowcount - 1; i++) {
			r = sheet.getRow(i + 1);
			for (int j = 0; j < cellcount; j++) {
				data[i][j] = formatter.formatCellValue(r.getCell(j));	//passing excel data to data object
			}
		}
		return data;													//return to testcase
	}

}
