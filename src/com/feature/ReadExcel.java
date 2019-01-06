package com.feature;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDataFormatter;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		HSSFDataFormatter dataFormatter = new HSSFDataFormatter();
		String path = ReadExcel.class.getResource("/excel").getPath();// 经过测试，这种方法也是安全的
		
		System.out.println("excel:" + path);
		
		HSSFWorkbook wb = null;
		POIFSFileSystem fs = null;
		try {
			fs = new POIFSFileSystem(new FileInputStream(path + "\\1111.xls"));
			wb = new HSSFWorkbook(fs);
		} catch (IOException e) {
			e.printStackTrace();
		}

		HSSFSheet sheet = wb.getSheetAt(0);
		HSSFRow row = sheet.getRow(0);
		HSSFCell oneCell = row.getCell(1);

		switch (oneCell.getCellType()) {

		case HSSFCell.CELL_TYPE_STRING:

			System.out.println("CELL_TYPE_STRING:" + oneCell.getStringCellValue());

			break;

		case HSSFCell.CELL_TYPE_FORMULA:

			System.out.println("CELL_TYPE_FORMULA:" + oneCell.getCellFormula());

			break;

		case HSSFCell.CELL_TYPE_NUMERIC:

			

			String cellFormatted = dataFormatter.formatCellValue(oneCell);
			
			System.out.println("CELL_TYPE_NUMERIC:" + cellFormatted);
			break;

		case HSSFCell.CELL_TYPE_ERROR:

			break;

		}

	}

	/*
	 * public static void method2() throws Exception {
	 * 
	 * InputStream is = new FileInputStream("e:\\workbook.xls"); HSSFWorkbook wb =
	 * new HSSFWorkbook(new POIFSFileSystem(is));
	 * 
	 * ExcelExtractor extractor = new ExcelExtractor(wb);
	 * extractor.setIncludeSheetNames(false);
	 * extractor.setFormulasNotResults(false);
	 * extractor.setIncludeCellComments(true);
	 * 
	 * String text = extractor.getText(); System.out.println(text); }
	 * 
	 * public static void method3() throws Exception { HSSFWorkbook wb = new
	 * HSSFWorkbook(new FileInputStream("e:\\workbook.xls")); HSSFSheet sheet =
	 * wb.getSheetAt(0);
	 * 
	 * for (Iterator<Row> iter = (Iterator<Row>) sheet.rowIterator();
	 * iter.hasNext();) { Row row = iter.next(); for (Iterator<Cell> iter2 =
	 * (Iterator<Cell>) row.cellIterator(); iter2.hasNext();) { Cell cell =
	 * iter2.next(); String content = cell.getStringCellValue();//
	 * 除非是sring类型，否则这样迭代读取会有错误 System.out.println(content); } } }
	 */
}
