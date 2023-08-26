package week6.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData {
	
	
	public static String[][] readData() throws IOException {
		
		
		XSSFWorkbook wbook = new XSSFWorkbook("data/Create Lead.xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);//read the first sheet
		int rowCount = sheet.getLastRowNum();
		short columnCount = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Row count "+rowCount);
		System.out.println("Column count "+columnCount);
		
		String [][] data = new String[rowCount][columnCount];
		
		XSSFRow firstDataRow = sheet.getRow(2);
		XSSFCell companyName = firstDataRow.getCell(1);
		//System.out.println(companyName.getStringCellValue());
		
		for(int i=1; i <= rowCount;i++) {
			XSSFRow row = sheet.getRow(i);

		for (int j = 0; j < columnCount; j++) {
			XSSFCell cell = row.getCell(j);
			System.out.println(cell.getStringCellValue());
			data[i-1][j] = cell.getStringCellValue();
			
			
		}

		
	}
		wbook.close();
		return data;

}
}
