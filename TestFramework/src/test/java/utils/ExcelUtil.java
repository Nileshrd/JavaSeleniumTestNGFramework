package utils;

import java.io.*;
import org.apache.poi.ss.usermodel.*;
public class ExcelUtil {
	
	public static String getCellData( int rowIndex, int colIndex) {
        String cellData = "";
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\New XLS Worksheet.xls");
            Workbook wb = WorkbookFactory.create(fis);
            Sheet sheet = wb.getSheetAt(0); // Get the first sheet
            Row row = sheet.getRow(rowIndex);
            Cell cell = row.getCell(colIndex);
            
          

            cellData = cell.toString();
            wb.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cellData;
    }
}
