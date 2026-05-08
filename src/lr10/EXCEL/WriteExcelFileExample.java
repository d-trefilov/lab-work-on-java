package lr10.EXCEL;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class WriteExcelFileExample {
    public static void main(String[] args) throws IOException {
        // Создаем новую книгу Excel
        XSSFWorkbook workbook = new XSSFWorkbook();

        // Создаем новый лист в книге
        XSSFSheet sheet = workbook.createSheet("Товары");

        // Создаем строку заголовков
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Товар");
        headerRow.createCell(1).setCellValue("Характеристика");
        headerRow.createCell(2).setCellValue("Стоимость");

        // Первая строка данных
        Row dataRow1 = sheet.createRow(1);
        dataRow1.createCell(0).setCellValue("Книга");
        dataRow1.createCell(1).setCellValue("Java. Полное руководство");
        dataRow1.createCell(2).setCellValue("1500.0");

        // Вторая строка данных
        Row dataRow2 = sheet.createRow(2);
        dataRow2.createCell(0).setCellValue("Компьютер");
        dataRow2.createCell(1).setCellValue("Процессор: Intel Core i5, Оперативная память: 16GB");
        dataRow2.createCell(2).setCellValue(25000.0);

        // Автоматическое изменение ширины столбцов
        for (int i = 0; i < 3; i++) {
            sheet.autoSizeColumn(i);
        }

        // Записываем книгу Excel в файл
        String fileName = "src/lr10/EXCEL/example3.xlsx";
        FileOutputStream outputStream = new FileOutputStream(fileName);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("Данные записаны в файл: " + fileName);
    }
}