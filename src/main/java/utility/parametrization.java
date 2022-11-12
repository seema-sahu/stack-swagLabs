package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class parametrization {
	public static String getExcelData (String sheetName, int row, int cell) throws EncryptedDocumentException, IOException  {
		FileInputStream file= new FileInputStream("C:\\Users\\seema sahu\\Documents\\automation testing\\swagLabs\\src\\test\\resources\\swaglabsLogin.xlsx");
		String value=WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
	
	    System.out.println(value);
		return value;
	}
	}
