import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exc {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\EXCELTC\\TCC.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		int sheetCount=workbook.getNumberOfSheets(); // number of sheets present in the given workbook
	
		for(int i=0;i<sheetCount;i++)
		{
			
			if(workbook.getSheetName(i).equalsIgnoreCase("arv"))  // getting the required sheet from the excel by referring index and name
			{
				XSSFSheet sheet=workbook.getSheetAt(i);   // storing the required sheet in a variable with retuen type as XSSFSheet
			
				Iterator<Row>rows =sheet.iterator();   // this sheet variable will have all the power to access rows in a arv sheet and sheet is a collection of rows
				
				Row r1=rows.next();   // this will take us to the desired row in a sheet arv  and row is a collection of cells
			
				Iterator<Cell>cells=r1.cellIterator();
				int k=0;
				int column = 0;
				while(cells.hasNext())
					{
						Cell c1=cells.next();
						
						if(c1.getStringCellValue().equalsIgnoreCase("TESTCASE"))
							{
								column=k;
							}
						k++;
						
					}
				System.out.println(column);
			
		}
			
		}

	}

}
