package cn.vans.com.excel;


import java.util.List;

public class ExportExcelTest {

    public static void main(String[] args) throws Exception {
        ExcelImportUtils utils = new ExcelImportUtils();
        List<Staff> excelData = utils.getExcelData2("/Users/cairuwang/java/code/myUtils/src/main/resources/templates/aa.xlsx", Staff.class, 2);
        for (Staff staff :excelData){
            System.out.println(staff.getUserName());
        }
    }
}
