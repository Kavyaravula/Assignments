package MyAssignments;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetDataFromExcel {

	public static int rowCount;
	public static int colCount;

	public static Object[][] getData(String pathOfTheExcel) throws Exception {

		FileInputStream fis = new FileInputStream(pathOfTheExcel);
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sh = book.getSheetAt(0);
		rowCount = sh.getLastRowNum();
		colCount = sh.getRow(0).getLastCellNum();

		System.out.println(rowCount);
		System.out.println(colCount);
		Object[][] data = new Object[rowCount][colCount];
	
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				data[i][j] = sh.getRow(i + 1).getCell(j).getStringCellValue();

			}
		}
		
		fis.close();
		return data;

	}

	public static void main(String[] args) throws Exception {
		Object[][] output = new Object[rowCount][colCount];
		output = getData("C:\\Users\\Chintu\\Desktop\\Data.xlsx");

		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				System.out.println(output[i][j]);
			}

		}

	}

}
