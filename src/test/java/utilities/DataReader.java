package utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.*;

public class DataReader {
    public static HashMap<String, String> StoreValues = new HashMap();
    public static List<HashMap<String, String>> data(String filepath, String sheetName) {
        List<HashMap<String, String>> mydata = new ArrayList<>();
        try {
            FileInputStream fs = new FileInputStream(filepath);
            XSSFWorkbook workbook = new XSSFWorkbook(fs);
            XSSFSheet sheet = workbook.getSheet(sheetName);
            Row HeaderRow = sheet.getRow(0);
            for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++)
            {
                Row currentRow = sheet.getRow(i);
                HashMap<String, String> currentHash = new HashMap<String, String>();
                for (int j = 0; j < currentRow.getPhysicalNumberOfCells(); j++)
                {
                    Cell currentCell = currentRow.getCell(j);
                    switch (currentCell.getCellType())
                    {
                        case STRING:
                            currentHash.put(HeaderRow.getCell(j).getStringCellValue(), currentCell.getStringCellValue());
                            break;
                    }
                }
                mydata.add(currentHash);
            }
            fs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mydata;
    }

}

