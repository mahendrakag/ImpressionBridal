package genric;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import junit.framework.Assert;

public abstract class BaseClass 
{
	Workbook workbook;//to handle workbook(excelsheet)
	Sheet sheet;
	Row row;
	Cell cell;
	File file;
	String path ="\\src\\test\\java\\DataFiles\\";
	public void readFileData(String FileName)
	{
		file =new File(this.getAndConcatCurrentPath(path+FileName));
		FileInputStream fis;
		try {
			 fis= new FileInputStream(file);
			 if(FileName.endsWith(".xlsx"))
				{
					workbook =new XSSFWorkbook(fis);
					sheet =workbook.getSheetAt(0);
					row =sheet.getRow(0);
					short colcount= row.getLastCellNum();
					
					for(int i=0;i<colcount;i++)
					{
						
						cell=row.getCell(i);
						String value=cell.getStringCellValue();
						System.out.println(" ="+value);
					}
					workbook.close();
				}
				else if(FileName.endsWith(".xlx"))
				{
					
				}
			
				else if(FileName.endsWith(".txt"))
				{
				
				}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(FileName.endsWith(".xlsx"))
		{
			
		}
		else if(FileName.endsWith(".xlx"))
		{
			
		}
	
		else if(FileName.endsWith(".txt"))
		{
		
		}
		
	}
	public <E> void writeFileData(String FileName , List<E> listOfVlaue)
	{
		
		file =new File(this.getAndConcatCurrentPath(path+FileName));
		FileOutputStream fos;
		try {
			 fos= new FileOutputStream(file);
			 if(FileName.endsWith(".xlsx"))
				{
					workbook =new XSSFWorkbook();
					sheet =workbook.createSheet();
					row =sheet.createRow(0);
					for(int i=0;i<listOfVlaue.size();i++)
					{
						
						cell=row.createCell(i);
						cell.setCellValue((String) listOfVlaue.get(i));
					}
					
					
					workbook.write(fos);
					workbook.close();
				}
				else if(FileName.endsWith(".xlx"))
				{
					
				}
			
				else if(FileName.endsWith(".txt"))
				{
					return ;
				}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public String getAndConcatCurrentPath(String path)
	{
		String currentpath= System.getProperty("user.dir");
		return currentpath + path;
	}
	public <T> void assertResult(T actual,T expected) {
		
		Assert.assertEquals(actual,expected) ;
	}
}
