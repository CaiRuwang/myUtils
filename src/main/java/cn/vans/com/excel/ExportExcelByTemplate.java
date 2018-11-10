package cn.vans.com.excel;

import net.sf.jxls.transformer.XLSTransformer;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExportExcelByTemplate {

    public static  void main(String agrs[]) throws IOException, InvalidFormatException {
        List<Staff> staffs = new ArrayList<Staff>();

        Staff s1 = new Staff("张三", "10", "男","上海","上海汇招","江苏南京");
        staffs.add(s1);

        Staff s2 = new Staff("李四", "10", "男","上海","上海汇招","江苏苏州");
        staffs.add(s2);

        Staff s3 = new Staff("王五", "10", "男","上海","上海汇招","江苏南通");
        staffs.add(s3);

        Staff s4 = new Staff("杜*", "10", "男","北京","上海汇招","江苏南京");
        staffs.add(s4);

        Staff s5 = new Staff("李*", "10", "男","北京","上海汇招","江苏苏州");
        staffs.add(s5);

        Staff s6 = new Staff("王*", "10", "男","北京","上海汇招","江苏南通");
        staffs.add(s6);



        String srcFilePath = "/Users/cairuwang/java/githubCode/myUtils/src/main/resources/templates/aa.xlsx";
        String templateFiles = "/Users/cairuwang/java/githubCode/myUtils/src/main/resources/templates/excelTemplates.xlsx";
        Map<String, List<Staff>> beanParams = new HashMap<String, List<Staff>>();
        beanParams.put("staffs", staffs);

        XLSTransformer former = new XLSTransformer();
        former.transformXLS(templateFiles, beanParams, srcFilePath);

        System.out.println("the end !!!");
    }
}
