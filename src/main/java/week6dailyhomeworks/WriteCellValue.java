package week6dailyhomeworks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteCellValue {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wbook=new XSSFWorkbook("./data/TC001.xlsx");
		String writeCellValue="Bharath";
		XSSFSheet currentSheet = wbook.getSheetAt(0);
		XSSFRow firstRow =currentSheet.getRow(1);
		XSSFCell cell = firstRow.getCell(0);
		cell.setCellValue(writeCellValue);
		 try {
	            // this Writes the workbook gfgcontribute
	            FileOutputStream out = new FileOutputStream(new File("TC001.xlsx"));
	            wbook.write(out);
	            out.close();
	            System.out.println("gfgcontribute.xlsx written successfully on disk.");
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
