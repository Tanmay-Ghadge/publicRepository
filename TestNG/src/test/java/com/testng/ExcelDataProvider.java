package com.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataProvider 
{
	@DataProvider
	public Object[][] excelData() throws Exception 
	{
      File excelFile=new File("C:\\Users\\tusha\\Documents\\learning\\java full course\\TestNG\\src\\test\\resources\\ExcelDataProvider.xlsx");
      System.out.println(excelFile.exists());
      
      FileInputStream rawdata=new FileInputStream(excelFile);
      XSSFWorkbook workbook=new XSSFWorkbook(rawdata);
      XSSFSheet sheet=workbook.getSheet("Sheet1");
      System.out.println(sheet.getLastRowNum());
      int numberOfRows=sheet.getPhysicalNumberOfRows();
      int numberOfCoulumns=sheet.getRow(0).getLastCellNum();
       
      
      Object[][] data=new Object[sheet.getLastRowNum()][numberOfCoulumns];
      for(int i=0;i<numberOfRows-1;i++) 
      {
    	  for(int j=0;j<numberOfCoulumns;j++)
    	  {
    		 String cellValue= sheet.getRow(i+1).getCell(j).getStringCellValue();  
    		 data[i][j]=cellValue;
    	  }
    	
      }
      return data;
      
      
      
      
      
      
      
      
      
	}
}
