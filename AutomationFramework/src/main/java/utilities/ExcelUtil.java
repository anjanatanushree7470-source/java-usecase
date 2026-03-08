package utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

public static String getData(int row,int col) throws Exception{

FileInputStream file = new FileInputStream(
"src/test/resources/testdata.xlsx");

XSSFWorkbook workbook = new XSSFWorkbook(file);

XSSFSheet sheet = workbook.getSheet("Sheet1");

return sheet.getRow(row).getCell(col).getStringCellValue();

}
}
