package com.feature;



import java.io.*;
 
import org.apache.poi.hssf.usermodel.*;
 
public class ReaderWriterFile {
 
	public String readExcelFile(String filename) {
		StringBuffer result = new StringBuffer();
		String fileToBeRead = filename;
 
		// ������Excel�������ļ�������
		HSSFWorkbook workbook = null;
		try {
			workbook = new HSSFWorkbook(new FileInputStream(fileToBeRead));
 
			// �����Թ���������á�
			HSSFSheet sheet = workbook.getSheetAt(0);
			// HSSFSheet sheet = workbook.getSheet("Sheet1");
			// �������е�Ԫ�񣬶�ȡ��Ԫ��
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
			System.out.println("�ļ�û�ҵ� : " + e);
		} catch (IOException e) {
			System.out.println("������IO�쳣: " + e);
		}
		return result.toString();
 
	}
 
	public void writeExcel(String path, String content) {
		String outputFile = path;
		String data = content;
 
		try {
			// �����µ�Excel ������
			HSSFWorkbook workbook = new HSSFWorkbook();
			// ��Excel�������н�һ����������Ϊȱʡֵ
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
			// �½�һ����ļ���
			FileOutputStream fOut = new FileOutputStream(outputFile);
			// ����Ӧ��Excel ����������
			workbook.write(fOut);
			fOut.flush();
			// �����������ر��ļ�
			fOut.close();
			System.out.println(path + "�ļ��������...");
 
		} catch (FileNotFoundException e) {
			System.out.println("�ļ�û�ҵ� : " + e);
		} catch (IOException e) {
			System.out.println("������IO�쳣 : " + e);
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
