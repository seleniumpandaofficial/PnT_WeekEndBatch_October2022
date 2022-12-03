package automation_code_13thNov_2022;

public class Excel_Operations {
	//Step1 - Created the Excel
	//Step2 - add maven dependencies for Excel file - YES
	//Step3 - use a utility file - YES
	//Step4 - Operations that are required (we will code)

	public static void main(String[] args) {
		
		
		String path = System.getProperty("user.dir") + "\\src\\test\\java\\automation_code_13thNov_2022\\DataSample.xlsx";

		Xls_Reader xls = new Xls_Reader(path);
		
		
		//1. to get the row count
		
		int row = xls.getRowCount("ShoppingTest");
		System.out.println(row);
		
		//2. to get the col count
		
		int col = xls.getColumnCount("ShoppingTest");
		System.out.println(col);
		
		//3. Read data from Excel File
		
		String data = xls.getCellData("ShoppingTest", 2, 3);
		System.out.println(data);
		
		String data1 = xls.getCellData("ShoppingTest", "ProductName", 4);
		System.out.println(data1);
		
		
		//4. write into excel sheet
		xls.setCellData("ShoppingTest", "ProductName", 11, "SonyTv");
	}

}
