package driveData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fs= new FileInputStream("C:\\Users\\anusha.patti\\Desktop\\datademo.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(fs);
		
		int Sheets = workbook.getNumberOfSheets();										//gets no of sheets
		
		for(int i=0;i<Sheets;i++) {
			if(workbook.getSheetAt(i).getSheetName().equalsIgnoreCase("testdata")) {	// searching for sheet
				XSSFSheet eSheet = workbook.getSheetAt(i);
				Iterator<Row> itr1 = eSheet.rowIterator();								//searching for row
				Row rowvalue = itr1.next();
				Iterator<Cell> itr2 = rowvalue.iterator();
				
				int count=0;
				int k=0;
				while(itr2.hasNext()) {
					Cell cellvalue = itr2.next();
					if(cellvalue.getStringCellValue().equalsIgnoreCase("Testcases")) {
						System.out.println(cellvalue.getStringCellValue());
						k=count;
					}
					count++;
				}
					
				System.out.println(k);
				
				
				while(itr1.hasNext()) {
					Row value = itr1.next();
					if(value.getCell(1).getStringCellValue().equalsIgnoreCase("purchase")) {
						Iterator<Cell> itr3 = value.cellIterator();
						while(itr3.hasNext()) {
							System.out.println(itr3.next());
						}
					}
				}
				
			}
			
		}
		
	}

}
