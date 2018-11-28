package Selenium1;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class ApachePOIreadandwrite {

	
	@Test
	public void test() throws Exception {

		
		File src =new File("C:\\Users\\aravind.g.kumar\\Desktop\\testdata.xlsx");
		
		FileInputStream fis =new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
	
		int rowCount1 = sh.getLastRowNum() - sh.getFirstRowNum();
		System.out.println("RowCount From Excel  "+rowCount1);
	
		for(int i=1;i<=rowCount1;i++){
			String data0= sh.getRow(i).getCell(1).getStringCellValue();
			String data1=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("data from excel is "+data0);
			//System.out.println(data1);
			
			
			Row header = sh.getRow(0);
			Cell Header1 = header.createCell(2);
			Header1.setCellValue("Status");
			sh.getRow(1).createCell(2).setCellValue("Pass");
			sh.getRow(2).createCell(2).setCellValue("fail");
		
		FileOutputStream fos=new FileOutputStream(src);
		wb.write(fos);
		
	
		
	}
}
}