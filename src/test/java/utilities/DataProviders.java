package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException{
		String path=".\\testData\\DWS_TESTDATA.xlsx";//taling xl file from testdata
		 
		Excelutility xlutil=new Excelutility(path);
		int totalrows = xlutil.getRowCount("login");
		int totalcols = xlutil.getCellCount("login", 0);
		System.out.println("Total Rows: " + totalrows);
		System.out.println("Total Columns: " + totalcols);
		String logindata [][]=new String[totalrows][totalcols];//created for the tow dimension array which can store 
		for (int i = 1; i <=totalrows; i++)//1 //read the data from the xl storing in the dimensional arrat
		{
			for (int j = 0; j <totalcols; j++) //0 i is row j is cols
			{
			logindata[i-1][j] = xlutil.getCellData("login", i, j);	//1,0
			}
			
		}
		return logindata;//returning tow dimesional array
		
	}
	
	

}
