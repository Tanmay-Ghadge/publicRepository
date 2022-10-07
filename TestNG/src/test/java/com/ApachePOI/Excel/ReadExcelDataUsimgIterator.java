package com.ApachePOI.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataUsimgIterator {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("D:\\tanmay\\SDET automation\\Selenium\\Apache POI Excel\\MyFile.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		Iterator itr=sheet.iterator();
		while(itr.hasNext())
		{
			XSSFRow row=(XSSFRow) itr.next();
			
			Iterator celliterator=row.cellIterator();
			
			while(celliterator.hasNext())
			{
				XSSFCell cell=(XSSFCell)celliterator.next();
				
				switch(cell.getCellType())
				{
				case STRING:System.out.println(cell.getStringCellValue());break;
				case NUMERIC:System.out.print(cell.getNumericCellValue());break;
				case BOOLEAN:System.out.print(cell.getBooleanCellValue());break;
		
				}
				
				System.out.println(" | ");
				
			}
			System.out.println();
		}
		
		System.out.println();
	}

}
