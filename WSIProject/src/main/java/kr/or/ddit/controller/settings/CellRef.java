package kr.or.ddit.controller.settings;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFCell;
 
public class CellRef {
 
    /**
     * Cell에 해당하는 Column Name을 가젼온다(A,B,C..)
     * 만약 Cell이 Null이라면 int cellIndex의 값으로
     * Column Name을 가져온다.
     * @param cell
     * @param cellIndex
     * @return
     */
    public static String getName(Cell cell, int cellIndex) {
        int cellNum = 0;
        if(cell != null) {
            cellNum = cell.getColumnIndex();
        }
        else {
            cellNum = cellIndex;
        }
        
        return CellReference.convertNumToColString(cellNum);
    }
    
    public static String getValue(Cell cell) {
        String value = "";
        
//        if (cell == null) {
//			continue;
//		} else {
//					// 타입별로 내용 읽기
//			switch (cell.getCellType()) {
//			case XSSFCell.CELL_TYPE_FORMULA:
//				value = cell.getCellFormula();
//				break;
//			case XSSFCell.CELL_TYPE_NUMERIC:
//				value = cell.getNumericCellValue() + "";
//				break;
//			case XSSFCell.CELL_TYPE_STRING:
//				value = cell.getStringCellValue() + "";
//				break;
//			case XSSFCell.CELL_TYPE_BLANK:
//				value = cell.getBooleanCellValue() + "";
//				break;
//			case XSSFCell.CELL_TYPE_ERROR:
//				value = cell.getErrorCellValue() + "";
//				break;
//			}
//		}
        
        return value;
    }
    
}