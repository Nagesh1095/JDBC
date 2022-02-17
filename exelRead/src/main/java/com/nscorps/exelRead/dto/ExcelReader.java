package com.nscorps.exelRead.dto;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) {
		readExcel();

	}

	public static void readExcel() {
		XSSFWorkbook workbook = null;
		XSSFSheet sheet = null;
		try {
			String excelpath = "./file/DataFile.xlsx";
			workbook = new XSSFWorkbook(excelpath);
			sheet = workbook.getSheet("Sheet1");

			int rows = sheet.getLastRowNum();
			int cols = sheet.getRow(1).getLastCellNum();

			for (int r = 0; r <= rows; r++) {

				XSSFRow row = sheet.getRow(r);
//				int serialNo = (int) row.getCell(0).getNumericCellValue();
//				String movieName = row.getCell(1).getStringCellValue();
//				int year = (int) row.getCell(2).getNumericCellValue();
//				String lang = row.getCell(3).getStringCellValue();
//				int budget = (int) row.getCell(4).getNumericCellValue();
//				String dir = row.getCell(5).getStringCellValue();
//				String sc = row.getCell(6).getStringCellValue();

				for (int c = 0; c < cols; c++) {
					XSSFCell cell = row.getCell(c);

					switch (cell.getCellType()) {
					case STRING:
						System.out.print(cell.getStringCellValue()+"\t");
						break;
					case NUMERIC:
						System.out.print((int)cell.getNumericCellValue()+"\t");
						break;

					}
//					System.out.print("\t");
				}
				System.out.println();
				System.out.println(
						"---------------------------------------------------------------------------------------------");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
