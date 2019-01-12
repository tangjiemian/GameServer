package com.feature.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDataFormatter;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.util.SystemOutLogger;

import com.server.handsomegame.GameEnvironmentContent;

class Utils{
	
	
	static String O_T_S(Object value) {
		
		return value.toString();
	}
	
	static Integer O_T_I(Object value) {
		return Integer.valueOf(value.toString()) ;
	}
}


public class ReadExcelUitl {

	public static final String separator = "/";
	public static final int startCell = 2;
	public static final int startRowWithTitle = 2;
	public static final int startRowNotTitle = 3;
	
	public static final int TITLE_ROW_INDEX = 2;
	
	private String sDir;
	private String filename;
	private String fullpath;
	private HSSFWorkbook wb = null;
	private POIFSFileSystem fs = null;
	private HSSFSheet sheet = null;
	private HSSFRow row = null;
	private HSSFDataFormatter dataFormatter = null;
	private int countRow = 0;
	private int countCell = 0;
	
	public ReadExcelUitl(String sDir, String filename) {
		this.sDir = sDir;
		this.filename = filename;
		this.dataFormatter = new HSSFDataFormatter();
	}

	/**
	 * 初始化工具参数，相对路径,EXCEL文件操作对像
	 * @return
	 */
	public ReadExcelUitl init() {
		System.out.println(this.getClass());
		System.out.println(this.getClass().getResource(separator + sDir).getPath());
		this.fullpath = this.getClass().getResource(separator + sDir).getPath();
		
		System.out.println(fullpath + File.separator + filename);
		try {
			fs = new POIFSFileSystem(new FileInputStream(fullpath + separator + filename));
			wb = new HSSFWorkbook(fs);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return this;
	}

	/**
	 * 指定表格页号
	 * @param index
	 * @return
	 */
	public ReadExcelUitl indexSheet(int index) {
		sheet = null;
		sheet = wb.getSheetAt(index);
		countRow = sheet.getLastRowNum();
		System.out.println(	"当前表格总行数:" + countRow);
		return this;
	}

	/**
	 * 指定当前行
	 * @param index
	 * @return
	 */
	public ReadExcelUitl indexRow(int index) {
		row = null;
		index = index == 0 ? 0 : index - 1;
		row = sheet.getRow(index);
		countCell = row.getLastCellNum();
		System.out.println("-------------------------"+"countCell:" +  countCell+"---------------------------------" + row);
		//System.out.println("countCell:" +  countCell);
		return this;
	}

	/**
	 * 取当前所在行的指定行号数据
	 * @param index
	 * @return
	 */
	public Object getCell(int cellIndex) {
		cellIndex = cellIndex == 0 ? 0 : cellIndex - 1;
		Object value = null;
		HSSFCell oneCell = row.getCell(cellIndex);
		if(null == oneCell) {
			return null;
		}
		switch (oneCell.getCellType()) {
			case HSSFCell.CELL_TYPE_STRING:
				value = oneCell.getStringCellValue();
				System.out.println("第" + (row.getRowNum() + 1) + "行第" + (cellIndex + 1) +"列_CELL_TYPE_STRING:" + value);
				break;
			case HSSFCell.CELL_TYPE_FORMULA:
				value =  oneCell.getCellFormula();
				System.out.println("第" + (row.getRowNum() + 1) + "行第" + (cellIndex + 1) + "列_CELL_TYPE_FORMULA:" + value);
				break;
			case HSSFCell.CELL_TYPE_NUMERIC:
				value = dataFormatter.formatCellValue(oneCell);
				System.out.println("第" + (row.getRowNum() + 1) + "行第" + (cellIndex + 1) + "列_CELL_TYPE_NUMERIC:" + value);
				break;
			case HSSFCell.CELL_TYPE_ERROR:
				break;
		}
		return value;
	}
	
	/**
	 *  取表格一行的所有列数据(起始坐标系=1)
	 * @param endCell
	 * @return
	 */
	public List<Object> getRowCells(int endCell) {
		List<Object> rowCellValues = new ArrayList<Object>();
		for(int i = startCell ;i<= endCell;i ++) {
			rowCellValues.add(getCell(i));
		}
		return rowCellValues;
	}
	
	
	public Map<String,String> getSheetTitileKeysForMap(){
		Map<String,String> keys = new HashMap<String ,String>();
		for(int i = startCell ;i<= countCell;i ++) {
			String title = Utils.O_T_S(getCell(i));
			keys.put(title, title);
		}
		return keys;
	}
	
	public List<String> getSheetTitileKeysForList(){
		List<String> keysList = new ArrayList<String>();
		this.indexRow(TITLE_ROW_INDEX);
		keysList.add(null);
		keysList.add(null);
		Object value;
		String title;
		for(int i = startCell ;i<= countCell;i ++) {
			value = getCell(i);
			title = null== value ? UUID.randomUUID().toString() : Utils.O_T_S(value);
			System.out.println(title);
			keysList.add(title);
		}
		
		System.out.println("keysList-size:" + keysList.size());
		
		return keysList;
	}
	
	/**
	 * 取一个表格所有的行列 数据,行从第3行开始,列从第2列开始(起始坐标系=1)
	 * @return
	 */
	public Map<Integer,List<Object>> getRowsCellsForList() {
		Map<Integer,List<Object>> sheetMap = new HashMap<Integer,List<Object>>();
		for(int rIndex = startRowNotTitle; rIndex < countRow ; rIndex ++) {
			this.indexRow(rIndex);
			List<Object> rowCellValues = new ArrayList<Object>();
			int count = 0;
			int IDKEY = 0;
			Object value;
			for(int cellIndex = startCell ;cellIndex<= countCell;cellIndex ++) {
				value = getCell(cellIndex);
				if(count == 0) {
					IDKEY = Integer.valueOf(value.toString()) ;
					count ++;
				}
				rowCellValues.add(value);
			}
			sheetMap.put(IDKEY, rowCellValues);
		}
		return sheetMap;
	}

	
	/**
	 * 取一个表格所有的行列 数据,行从第3行开始,列从第2列开始(起始坐标系=1)
	 * @return
	 */
	public Map<Integer,Map<String,Object>> getRowsCellsForMap() {
		Map<Integer,Map<String,Object>> sheetMap = new HashMap<Integer,Map<String,Object>>();
		List<String> keysList = this.getSheetTitileKeysForList();
		for(int rowIndex = startRowNotTitle; rowIndex < countRow ; rowIndex ++) {
			this.indexRow(rowIndex);
			Map<String,Object> kvMap = new HashMap<String,Object>();
			int count = 0;
			int lineId = 0;
			Object value;
			for(int cellIndex = startCell ;cellIndex<= countCell;cellIndex ++) {
				value = getCell(cellIndex);
				if(count == 0) {
					lineId = Utils .O_T_I(value) ;
					System.out.println("ID:" + lineId);
					count ++;
				}
				kvMap.put(keysList.get(cellIndex), value);
			}
			sheetMap.put(lineId, kvMap);
		}
		return sheetMap;
	}
	
	
	public static void main(String[] args) throws Exception {
		ReadExcelUitl exceutil = new ReadExcelUitl("excel","1111.xls");
		Map<Integer,Map<String,Object>> map = exceutil.init().indexSheet(4).getRowsCellsForMap();
		System.out.println(map.get(100).get("ID"));
		System.out.println(map.get(100).get("NAME"));
		//exceutil.init().indexSheet(0).getRowsCells();
		GameEnvironmentContent.gameHeroSetting = new ReadExcelUitl("excel", "1111.xls").init().indexSheet(0)
				.getRowsCellsForMap();
		
		GameEnvironmentContent.gameSkillSetting = new ReadExcelUitl("excel", "1111.xls").init().indexSheet(3)
				.getRowsCellsForMap();

	}
}
