package Base;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {
    private Workbook workbook;
    private Sheet sheet;

    // Constructor to load the Excel file and specify the sheet name
    public ExcelUtils(String filePath, String sheetName) {
        try {
            FileInputStream file = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(file);
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to get data from a specific cell
    public String getCellData(int rowNum, int colNum) {
        Row row = sheet.getRow(rowNum);
        Cell cell = row.getCell(colNum);
        String cellData = null;
        switch (cell.getCellType()) {
            case STRING:
                cellData = cell.getStringCellValue();
                break;
            case NUMERIC:
                cellData = String.valueOf(cell.getNumericCellValue());
                break;
            case BOOLEAN:
                cellData = String.valueOf(cell.getBooleanCellValue());
                break;
            case FORMULA:
                cellData = cell.getCellFormula();
                break;
            default:
                cellData = "";
        }
        return cellData;
    }

    // Method to get the total number of rows
    public int getRowCount() {
        return sheet.getPhysicalNumberOfRows();
    }

    // Method to get the total number of columns in a row
    public int getColumnCount(int rowNum) {
        Row row = sheet.getRow(rowNum);
        return row.getPhysicalNumberOfCells();
    }

    // Close the workbook to free resources
    public void closeWorkbook() {
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
