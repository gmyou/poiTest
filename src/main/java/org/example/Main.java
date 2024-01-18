package org.example;

import org.apache.poi.ss.usermodel.Workbook;
import org.example.excel.CustomerExcelReader;
import org.example.excel.CustomerExcelWriter;
import org.example.vo.CustomerVo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // sample data
        List<CustomerVo> list = new ArrayList<CustomerVo>();
        list.add(new CustomerVo("1", "Jack You", "20", "jack@example.org"));
        list.add(new CustomerVo("2", "John Lee", "30", "john@example.org"));

        CustomerExcelWriter excelWriter = new CustomerExcelWriter();
        // xlsx writer
        File file = excelWriter.xlsxWriter(list, "test.xlsx");

        // xlsx reader
        CustomerExcelReader excelReader = new CustomerExcelReader();
        excelReader.xlsxReader(file);

        // todo combine xlsx files
    }
}