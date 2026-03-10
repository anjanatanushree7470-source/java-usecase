package utilities;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

public static Object[][] getExcelData(String path,String sheetName){

Object[][] data=null;

try{

FileInputStream file=new FileInputStream(path);

Workbook wb=new XSSFWorkbook(file);

Sheet sheet=wb.getSheet(sheetName);

int rows=sheet.getPhysicalNumberOfRows();

int cols=sheet.getRow(0).getPhysicalNumberOfCells();

data=new Object[rows-1][cols];

for(int i=1;i<rows;i++){

for(int j=0;j<cols;j++){

data[i-1][j]=sheet.getRow(i).getCell(j).toString();

}

}

}catch(Exception e){}

return data;

}

}