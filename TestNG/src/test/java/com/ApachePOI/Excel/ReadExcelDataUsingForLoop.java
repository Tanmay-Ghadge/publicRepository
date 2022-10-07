package com.ApachePOI.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataUsingForLoop {

	public static void main(String[] args) throws IOException 
	{
		File file=new File("D:\\tanmay\\SDET automation\\Selenium\\Apache POI Excel\\MyFile.xlsx");
		System.out.println(file.exists());
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		System.out.println(sheet.getLastRowNum());//5 but actual rows are 6
		int rows=sheet.getLastRowNum();
		int coulumns=sheet.getRow(1).getLastCellNum();
		System.out.println("rows-"+rows+" columns-"+coulumns); 
		
		for(int row=1;row<=rows;row++)
		{
			XSSFRow rownumber= sheet.getRow(row);
			for(int column=0;column<coulumns;column++)
			{
				XSSFCell cellValue=rownumber.getCell(column);
				
				switch(cellValue.getCellType())
				{
				case STRING:System.out.print(cellValue.getStringCellValue());break;
				case NUMERIC:System.out.print(cellValue.getNumericCellValue());break;
				case BOOLEAN:System.out.print(cellValue.getBooleanCellValue());break;
				
				}
				System.out.print(" | ");
			
			}
			System.out.println();
		}
		
		
		
		
	}

}
