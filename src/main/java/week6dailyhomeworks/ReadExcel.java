package week6dailyhomeworks;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wbook=new XSSFWorkbook("./data/TC001.xlsx");
		XSSFSheet currentSheet = wbook.getSheetAt(0);
		int rowCount=currentSheet.getLastRowNum();
		int colCount=currentSheet.getRow(0).getLastCellNum();
		for(int i=1;i<=rowCount;i++)
		{
			XSSFRow row = currentSheet.getRow(i);
			for(int j=0;j<colCount;j++)
			{
				XSSFCell cell = row.getCell(j);
				String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
			}
		}
		wbook.close();
	}

}
