package EXCEL.MyParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

public class ReadExcelFileExample {

    public static void main(String[] args) {

        String filePath = "src/lr10/EXCEL/example3.xlsx";
        File file = new File(filePath);

        // Проверка существования файла
        if (!file.exists()) {
            System.out.println("❌ Ошибка: файл не найден по пути:");
            System.out.println(filePath);
            System.out.println("👉 Проверьте расположение файла.");
            return;
        }

        try (FileInputStream inputStream = new FileInputStream(file);
             XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {

            String sheetName = "Товары";
            XSSFSheet sheet = workbook.getSheet(sheetName);

            // Проверка существования листа
            if (sheet == null) {
                System.out.println("❌ Ошибка: лист \"" + sheetName + "\" не найден.");

                System.out.println("👉 Доступные листы:");
                for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
                    System.out.println(" - " + workbook.getSheetAt(i).getSheetName());
                }
                return;
            }

            // Чтение данных
            System.out.println("📄 Содержимое листа \"" + sheetName + "\":\n");

            for (Row row : sheet) {
                for (Cell cell : row) {

                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;

                        case NUMERIC:
                            if (DateUtil.isCellDateFormatted(cell)) {
                                System.out.print(cell.getDateCellValue() + "\t");
                            } else {
                                System.out.print(cell.getNumericCellValue() + "\t");
                            }
                            break;

                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + "\t");
                            break;

                        case FORMULA:
                            System.out.print(cell.getCellFormula() + "\t");
                            break;

                        case BLANK:
                            System.out.print("[пусто]\t");
                            break;

                        default:
                            System.out.print("[?]\t");
                    }
                }
                System.out.println();
            }

            System.out.println("\n✅ Чтение завершено успешно.");

        } catch (IOException e) {
            System.out.println("❌ Ошибка при чтении файла Excel:");
            System.out.println("👉 Возможно файл повреждён или открыт в Excel.");
        } catch (Exception e) {
            System.out.println("❌ Неизвестная ошибка:");
            System.out.println(e.getMessage());
        }
    }
}