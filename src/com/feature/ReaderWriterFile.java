package com.feature;



import java.io.*;
 
import org.apache.poi.hssf.usermodel.*;
 
public class ReaderWriterFile {
 
	public String readExcelFile(String filename) {
		StringBuffer result = new StringBuffer();
		String fileToBeRead = filename;
 
		// 创建对Excel工作簿文件的引用
		HSSFWorkbook workbook = null;
		try {
			workbook = new HSSFWorkbook(new FileInputStream(fileToBeRead));
 
			// 创建对工作表的引用。
			HSSFSheet sheet = workbook.getSheetAt(0);
			// HSSFSheet sheet = workbook.getSheet("Sheet1");
			// 便利所有单元格，读取单元格
			int row_num = sheet.getLastRowNum();
			for (int i = 0; i < row_num; i++) {
				HSSFRow r = sheet.getRow(i);
				int cell_num = r.getLastCellNum();
				for (int j = 0; j < cell_num; j++) {
					//System.out.println(r.getCell((short)j).getCellType());
					if(r.getCell((short)j).getCellType() == 1){
						result.append(r.getCell((short) j).getStringCellValue());
					}else{
						result.append(r.getCell((short) j).getNumericCellValue());
					}
					result.append("\t");
				}
				result.append("\n");
			}
		} catch (FileNotFoundException e) {
			System.out.println("文件没找到 : " + e);
		} catch (IOException e) {
			System.out.println("已运行IO异常: " + e);
		}
		return result.toString();
 
	}
 
	public void writeExcel(String path, String content) {
		String outputFile = path;
		String data = content;
 
		try {
			// 创建新的Excel 工作簿
			HSSFWorkbook workbook = new HSSFWorkbook();
			// 在Excel工作簿中建一工作表，其名为缺省值
			HSSFSheet sheet = workbook.createSheet();
 
			String[] rows = data.split("\n");
			for (int i = 0; i < rows.length; i++) {
				HSSFRow row = sheet.createRow((short) i);
				String[] cells = rows[i].split("\t");
				for (int j = 0; j < cells.length; j++) {
					HSSFCell cell = row.createCell((short) j);
					cell.setCellType(HSSFCell.CELL_TYPE_STRING);
					cell.setCellValue(cells[j]);
				}
			}
			// 新建一输出文件流
			FileOutputStream fOut = new FileOutputStream(outputFile);
			// 把相应的Excel 工作簿存盘
			workbook.write(fOut);
			fOut.flush();
			// 操作结束，关闭文件
			fOut.close();
			System.out.println(path + "文件生成完毕...");
 
		} catch (FileNotFoundException e) {
			System.out.println("文件没找到 : " + e);
		} catch (IOException e) {
			System.out.println("已运行IO异常 : " + e);
		}
	}
 
	public String readWordFile(String filename) {
		return "";
	}
 
	public static void main(String[] arg) {
		ReaderWriterFile rw = new ReaderWriterFile();
		String res = rw.readExcelFile("D:\\1111.xls");
		System.out.println(res);
		rw.writeExcel("D:\\out.xls", res);
	}
 
}
