package utilities;

import org.testng.annotations.DataProvider;

public class DataProviderClass {

@DataProvider(name="formData")

public Object[][] getData(){

String path="src/test/resources/testdata.xlsx";

return ExcelUtil.getExcelData(path,"Sheet1");

}

}