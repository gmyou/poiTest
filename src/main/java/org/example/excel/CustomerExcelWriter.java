package org.example.excel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.vo.CustomerVo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class CustomerExcelWriter {
    public void xlsxWriter(List<CustomerVo> list) {
        // create workbook
        XSSFWorkbook workbook = new XSSFWorkbook();
        // create worksheet
        XSSFSheet sheet = workbook.createSheet();
        // create row
        XSSFRow row = sheet.createRow(0);
        // create cell
        XSSFCell cell;

        // header info configuration
        cell = row.createCell(0);
        cell.setCellValue("ID");

        cell = row.createCell(1);
        cell.setCellValue("Name");

        cell = row.createCell(2);
        cell.setCellValue("Age");

        cell = row.createCell(3);
        cell.setCellValue("Email");

        // create row as much as the size of the list
        CustomerVo vo;
        for (int rowIdx = 0; rowIdx < list.size(); rowIdx++) {
            vo = list.get(rowIdx);

            // create row
            row = sheet.createRow(rowIdx + 1);

            cell = row.createCell(0);
            cell.setCellValue(vo.getCusId());

            cell = row.createCell(1);
            cell.setCellValue(vo.getCusName());

            cell = row.createCell(2);
            cell.setCellValue(vo.getCusAge());

            cell = row.createCell(3);
            cell.setCellValue(vo.getCusEmail());

        }

        // write the entered content to a file
        File file = new File("test.xlsx");
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(file);
            workbook.write(fos);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (workbook != null) workbook.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
