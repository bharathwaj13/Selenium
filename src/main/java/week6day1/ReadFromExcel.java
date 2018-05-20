package week6day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadFromExcel {
	public Object[][] readExcel(String excelFileName) throws IOException
	{
		XSSFWorkbook wbook = new XSSFWorkbook("./data/"+excelFileName+".xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int rowCount = sheet.getLastRowNum();
		short columnCount = sheet.getRow(0).getLastCellNum();
		Object[][] objName=new Object[rowCount][columnCount];
		for(int i=1;i<=rowCount;i++ )
		{
			XSSFRow row = sheet.getRow(i);
			for (int j=0;j<columnCount;j++)
			{
				XSSFCell cell = row.getCell(j);
				objName[i-1][j] = cell.getStringCellValue();
//				System.out.println(stringCellValue);
			}
		}
		wbook.close();
		return objName;
		
		
	}

}