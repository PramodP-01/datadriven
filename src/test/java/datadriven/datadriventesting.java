package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class datadriventesting {

	@Test
	public ArrayList<String> getdata(String testdata) throws IOException {

		ArrayList<String> arr = new ArrayList<String>();

		FileInputStream fis = new FileInputStream("/home/pramodp/Documents/demo.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);// path and getting access to complete excel

		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++)

			if (workbook.getSheetName(i).equalsIgnoreCase("Sample")) {

				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				rows.next();
				Row second = rows.next();
				Iterator<Cell> ce = second.cellIterator();
				while (ce.hasNext()) {
					Cell value = ce.next();
					int k = 0;
					int column = 0;
					if (value.getStringCellValue().equalsIgnoreCase("Data1"))
						;

					{
						column = k;
						k++;
					}
					while (rows.hasNext()) {
						Row datas = rows.next();
						if (datas.getCell(column).getStringCellValue().equalsIgnoreCase("testdata")) {
							Iterator<Cell> cv = datas.cellIterator();
							while (cv.hasNext()) {
								arr.add(cv.next().getStringCellValue());

							}

						}
					}
				}
			}
		return arr;
	}
	

	@Test
	public void Data() throws IOException {

	}
}
