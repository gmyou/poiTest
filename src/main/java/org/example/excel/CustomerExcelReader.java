package org.example.excel;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.IOException;

public class CustomerExcelReader {
    public void xlsxReader(File file) {
        try {
            // create workbook
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            // create worksheet
            XSSFSheet sheet = workbook.getSheetAt(0);
            // create row
            XSSFRow row;
            // create cell
            XSSFCell cell;

            // get the number of rows
            int rows = sheet.getPhysicalNumberOfRows();
            for (int rowIdx = 0; rowIdx < rows; rowIdx++) {
                // get row
                row = sheet.getRow(rowIdx);

                // get the number of cells
                int cells = row.getPhysicalNumberOfCells();
                for (int cellIdx = 0; cellIdx < cells; cellIdx++) {
                    // get cell
                    cell = row.getCell(cellIdx);
                    // get value
                    String value = cell.getStringCellValue();
                    System.out.println(value);

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
    }
}
